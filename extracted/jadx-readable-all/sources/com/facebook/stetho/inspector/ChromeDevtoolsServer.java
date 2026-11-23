package com.facebook.stetho.inspector;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequest;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.CloseCodes;
import com.facebook.stetho.websocket.SimpleEndpoint;
import com.facebook.stetho.websocket.SimpleSession;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class ChromeDevtoolsServer implements SimpleEndpoint {
    public static final String PATH = "/inspector";
    private static final String TAG = "ChromeDevtoolsServer";
    private final MethodDispatcher mMethodDispatcher;
    private final ObjectMapper mObjectMapper;
    private final Map<SimpleSession, JsonRpcPeer> mPeers = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.facebook.stetho.inspector.ChromeDevtoolsServer$1 */
    public static /* synthetic */ class C58181 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode */
        public static final /* synthetic */ int[] f28297x978b462;

        static {
            JsonRpcError.ErrorCode.values();
            int[] iArr = new int[5];
            f28297x978b462 = iArr;
            try {
                iArr[JsonRpcError.ErrorCode.METHOD_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ChromeDevtoolsServer(Iterable<ChromeDevtoolsDomain> iterable) {
        ObjectMapper objectMapper = new ObjectMapper();
        this.mObjectMapper = objectMapper;
        this.mMethodDispatcher = new MethodDispatcher(objectMapper, iterable);
    }

    private void closeSafely(SimpleSession simpleSession, int i, String str) {
        simpleSession.close(i, str);
    }

    private void handleRemoteMessage(JsonRpcPeer jsonRpcPeer, String str) throws Throwable {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("method")) {
            handleRemoteRequest(jsonRpcPeer, jSONObject);
        } else {
            if (!jSONObject.has("result")) {
                throw new MessageHandlingException(outline.m1599u("Improper JSON-RPC message: ", str));
            }
            handleRemoteResponse(jsonRpcPeer, jSONObject);
        }
    }

    private void handleRemoteRequest(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws Throwable {
        JSONObject jSONObject2;
        JSONObject jSONObjectDispatch;
        String string;
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) this.mObjectMapper.convertValue(jSONObject, JsonRpcRequest.class);
        try {
            jSONObjectDispatch = this.mMethodDispatcher.dispatch(jsonRpcPeer, jsonRpcRequest.method, jsonRpcRequest.params);
            jSONObject2 = null;
        } catch (JsonRpcException e) {
            logDispatchException(e);
            jSONObject2 = (JSONObject) this.mObjectMapper.convertValue(e.getErrorMessage(), JSONObject.class);
            jSONObjectDispatch = null;
        }
        if (jsonRpcRequest.f28298id != null) {
            JsonRpcResponse jsonRpcResponse = new JsonRpcResponse();
            jsonRpcResponse.f28299id = jsonRpcRequest.f28298id.longValue();
            jsonRpcResponse.result = jSONObjectDispatch;
            jsonRpcResponse.error = jSONObject2;
            try {
                string = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            } catch (OutOfMemoryError e2) {
                jsonRpcResponse.result = null;
                jsonRpcResponse.error = (JSONObject) this.mObjectMapper.convertValue(e2.getMessage(), JSONObject.class);
                string = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            }
            jsonRpcPeer.getWebSocket().sendText(string);
        }
    }

    private void handleRemoteResponse(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws MismatchedResponseException {
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) this.mObjectMapper.convertValue(jSONObject, JsonRpcResponse.class);
        PendingRequest andRemovePendingRequest = jsonRpcPeer.getAndRemovePendingRequest(jsonRpcResponse.f28299id);
        if (andRemovePendingRequest == null) {
            throw new MismatchedResponseException(jsonRpcResponse.f28299id);
        }
        PendingRequestCallback pendingRequestCallback = andRemovePendingRequest.callback;
        if (pendingRequestCallback != null) {
            pendingRequestCallback.onResponse(jsonRpcPeer, jsonRpcResponse);
        }
    }

    private static void logDispatchException(JsonRpcException jsonRpcException) {
        JsonRpcError errorMessage = jsonRpcException.getErrorMessage();
        if (errorMessage.code.ordinal() != 2) {
            LogRedirector.m12594w(TAG, "Error processing remote message", jsonRpcException);
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("Method not implemented: ");
        sbM1556G.append(errorMessage.message);
        LogRedirector.m12585d(TAG, sbM1556G.toString());
    }

    @Override // com.facebook.stetho.websocket.SimpleEndpoint
    public void onClose(SimpleSession simpleSession, int i, String str) {
        LogRedirector.m12585d(TAG, "onClose: reason=" + i + " " + str);
        JsonRpcPeer jsonRpcPeerRemove = this.mPeers.remove(simpleSession);
        if (jsonRpcPeerRemove != null) {
            jsonRpcPeerRemove.invokeDisconnectReceivers();
        }
    }

    @Override // com.facebook.stetho.websocket.SimpleEndpoint
    public void onError(SimpleSession simpleSession, Throwable th) {
        StringBuilder sbM1556G = outline.m1556G("onError: ex=");
        sbM1556G.append(th.toString());
        LogRedirector.m12587e(TAG, sbM1556G.toString());
    }

    @Override // com.facebook.stetho.websocket.SimpleEndpoint
    public void onMessage(SimpleSession simpleSession, byte[] bArr, int i) {
        LogRedirector.m12585d(TAG, "Ignoring binary message of length " + i);
    }

    @Override // com.facebook.stetho.websocket.SimpleEndpoint
    public void onOpen(SimpleSession simpleSession) {
        LogRedirector.m12585d(TAG, "onOpen");
        this.mPeers.put(simpleSession, new JsonRpcPeer(this.mObjectMapper, simpleSession));
    }

    @Override // com.facebook.stetho.websocket.SimpleEndpoint
    public void onMessage(SimpleSession simpleSession, String str) throws Throwable {
        if (LogRedirector.isLoggable(TAG, 2)) {
            LogRedirector.m12591v(TAG, "onMessage: message=" + str);
        }
        try {
            JsonRpcPeer jsonRpcPeer = this.mPeers.get(simpleSession);
            Util.throwIfNull(jsonRpcPeer);
            handleRemoteMessage(jsonRpcPeer, str);
        } catch (MessageHandlingException e) {
            LogRedirector.m12589i(TAG, "Message could not be processed by implementation: " + e);
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e.getClass().getSimpleName());
        } catch (IOException e2) {
            if (LogRedirector.isLoggable(TAG, 2)) {
                LogRedirector.m12591v(TAG, "Unexpected I/O exception processing message: " + e2);
            }
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e2.getClass().getSimpleName());
        } catch (JSONException e3) {
            LogRedirector.m12592v(TAG, "Unexpected JSON exception processing message", e3);
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e3.getClass().getSimpleName());
        }
    }
}
