package com.facebook.stetho.okhttp3;

import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import java.io.IOException;
import java.io.InputStream;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Connection;
import p509g1.Interceptor;
import p509g1.MediaType2;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p524h1.BufferedSource;
import p524h1.JvmOkio;
import p524h1.RealBufferedSink;
import p524h1.RealBufferedSource;
import p524h1.Sink;
import p524h1.Timeout2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: loaded from: classes.dex */
public class StethoInterceptor implements Interceptor {
    private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();

    public static class ForwardingResponseBody extends ResponseBody {
        private final ResponseBody mBody;
        private final BufferedSource mInterceptedSource;

        public ForwardingResponseBody(ResponseBody responseBody, InputStream inputStream) {
            this.mBody = responseBody;
            Intrinsics2.m13090f(inputStream, "$this$source");
            JvmOkio jvmOkio = new JvmOkio(inputStream, new Timeout2());
            Intrinsics2.m13090f(jvmOkio, "$this$buffer");
            this.mInterceptedSource = new RealBufferedSource(jvmOkio);
        }

        @Override // p509g1.ResponseBody
        public long contentLength() {
            return this.mBody.contentLength();
        }

        @Override // p509g1.ResponseBody
        public MediaType2 contentType() {
            return this.mBody.contentType();
        }

        @Override // p509g1.ResponseBody
        public BufferedSource source() {
            return this.mInterceptedSource;
        }
    }

    public static class OkHttpInspectorRequest implements NetworkEventReporter.InspectorRequest {
        private final Request3 mRequest;
        private RequestBodyHelper mRequestBodyHelper;
        private final String mRequestId;

        public OkHttpInspectorRequest(String str, Request3 request3, RequestBodyHelper requestBodyHelper) {
            this.mRequestId = str;
            this.mRequest = request3;
            this.mRequestBodyHelper = requestBodyHelper;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public byte[] body() throws Throwable {
            RequestBody requestBody = this.mRequest.f29954e;
            if (requestBody == null) {
                return null;
            }
            Sink sinkM14072X = SkuDao.a.m14072X(this.mRequestBodyHelper.createBodySink(firstHeaderValue("Content-Encoding")));
            Intrinsics2.m13090f(sinkM14072X, "$this$buffer");
            RealBufferedSink realBufferedSink = new RealBufferedSink(sinkM14072X);
            try {
                requestBody.mo13328d(realBufferedSink);
                return this.mRequestBodyHelper.getDisplayBody();
            } finally {
                realBufferedSink.close();
            }
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String firstHeaderValue(String str) {
            return this.mRequest.m13312b(str);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequestCommon
        public String friendlyName() {
            return null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public Integer friendlyNameExtra() {
            return null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public int headerCount() {
            return this.mRequest.f29953d.size();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerName(int i) {
            return this.mRequest.f29953d.f30639g[i * 2];
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerValue(int i) {
            return this.mRequest.f29953d.f30639g[(i * 2) + 1];
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequestCommon
        /* JADX INFO: renamed from: id */
        public String mo12616id() {
            return this.mRequestId;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public String method() {
            return this.mRequest.f29952c;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public String url() {
            return this.mRequest.f29951b.f30652l;
        }
    }

    public static class OkHttpInspectorResponse implements NetworkEventReporter.InspectorResponse {
        private final Connection mConnection;
        private final Request3 mRequest;
        private final String mRequestId;
        private final Response3 mResponse;

        public OkHttpInspectorResponse(String str, Request3 request3, Response3 response3, Connection connection) {
            this.mRequestId = str;
            this.mRequest = request3;
            this.mResponse = response3;
            this.mConnection = connection;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public int connectionId() {
            Connection connection = this.mConnection;
            if (connection == null) {
                return 0;
            }
            return connection.hashCode();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public boolean connectionReused() {
            return false;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String firstHeaderValue(String str) {
            return Response3.m13336c(this.mResponse, str, null, 2);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public boolean fromDiskCache() {
            return this.mResponse.f29998o != null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public int headerCount() {
            return this.mResponse.f29995l.size();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerName(int i) {
            return this.mResponse.f29995l.f30639g[i * 2];
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerValue(int i) {
            return this.mResponse.f29995l.f30639g[(i * 2) + 1];
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public String reasonPhrase() {
            return this.mResponse.f29992i;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public String requestId() {
            return this.mRequestId;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public int statusCode() {
            return this.mResponse.f29993j;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public String url() {
            return this.mRequest.f29951b.f30652l;
        }
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws IOException {
        RequestBodyHelper requestBodyHelper;
        MediaType2 mediaType2ContentType;
        InputStream inputStreamByteStream;
        String strNextRequestId = this.mEventReporter.nextRequestId();
        Request3 request3Mo13494c = aVar.mo13494c();
        if (this.mEventReporter.isEnabled()) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, strNextRequestId);
            this.mEventReporter.requestWillBeSent(new OkHttpInspectorRequest(strNextRequestId, request3Mo13494c, requestBodyHelper));
        } else {
            requestBodyHelper = null;
        }
        try {
            Response3 response3Mo13492a = aVar.mo13492a(request3Mo13494c);
            if (!this.mEventReporter.isEnabled()) {
                return response3Mo13492a;
            }
            if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                requestBodyHelper.reportDataSent();
            }
            Connection connectionMo13493b = aVar.mo13493b();
            if (connectionMo13493b == null) {
                throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
            }
            this.mEventReporter.responseHeadersReceived(new OkHttpInspectorResponse(strNextRequestId, request3Mo13494c, response3Mo13492a, connectionMo13493b));
            ResponseBody responseBody = response3Mo13492a.f29996m;
            if (responseBody != null) {
                mediaType2ContentType = responseBody.contentType();
                inputStreamByteStream = responseBody.byteStream();
            } else {
                mediaType2ContentType = null;
                inputStreamByteStream = null;
            }
            InputStream inputStreamInterpretResponseStream = this.mEventReporter.interpretResponseStream(strNextRequestId, mediaType2ContentType != null ? mediaType2ContentType.f30665d : null, Response3.m13336c(response3Mo13492a, "Content-Encoding", null, 2), inputStreamByteStream, new DefaultResponseHandler(this.mEventReporter, strNextRequestId));
            if (inputStreamInterpretResponseStream == null) {
                return response3Mo13492a;
            }
            Response3.a aVar2 = new Response3.a(response3Mo13492a);
            aVar2.f30009g = new ForwardingResponseBody(responseBody, inputStreamInterpretResponseStream);
            return aVar2.m13339a();
        } catch (IOException e) {
            if (this.mEventReporter.isEnabled()) {
                this.mEventReporter.httpExchangeFailed(strNextRequestId, e.toString());
            }
            throw e;
        }
    }
}
