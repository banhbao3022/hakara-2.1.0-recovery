package p007c.p165l.p183m0.p184b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.CallbackManager;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookOperationCanceledException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.HttpMethod;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p175i0.C1095a;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.CallbackManagerImpl;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.Sharer;
import p007c.p165l.p183m0.p185c.ShareMedia;
import p007c.p165l.p183m0.p185c.ShareOpenGraphAction;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p007c.p165l.p183m0.p185c.SharePhoto;
import p007c.p165l.p183m0.p185c.SharePhotoContent;
import p007c.p165l.p183m0.p185c.ShareVideo;

/* JADX INFO: renamed from: c.l.m0.b.r, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility4 {

    /* JADX INFO: renamed from: c.l.m0.b.r$a */
    /* JADX INFO: compiled from: ShareInternalUtility.java */
    public static class a implements CallbackManagerImpl.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5236a;

        public a(int i) {
            this.f5236a = i;
        }

        @Override // p007c.p165l.p178k0.CallbackManagerImpl.a
        /* JADX INFO: renamed from: a */
        public boolean mo2427a(int i, Intent intent) {
            return ShareInternalUtility4.m2638f(this.f5236a, i, intent, new ShareInternalUtility3(null, null));
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.r$b */
    /* JADX INFO: compiled from: ShareInternalUtility.java */
    public static class b implements CallbackManagerImpl.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5237a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FacebookCallback f5238b;

        public b(int i, FacebookCallback facebookCallback) {
            this.f5237a = i;
            this.f5238b = facebookCallback;
        }

        @Override // p007c.p165l.p178k0.CallbackManagerImpl.a
        /* JADX INFO: renamed from: a */
        public boolean mo2427a(int i, Intent intent) {
            int i2 = this.f5237a;
            FacebookCallback facebookCallback = this.f5238b;
            return ShareInternalUtility4.m2638f(i2, i, intent, new ShareInternalUtility3(facebookCallback, facebookCallback));
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.r$c */
    /* JADX INFO: compiled from: ShareInternalUtility.java */
    public static class c implements Utility.c<SharePhoto, NativeAppCallAttachmentStore.b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f5239a;

        public c(UUID uuid) {
            this.f5239a = uuid;
        }

        @Override // p007c.p165l.p178k0.Utility.c
        public NativeAppCallAttachmentStore.b apply(SharePhoto sharePhoto) {
            return ShareInternalUtility4.m2633a(this.f5239a, sharePhoto);
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.r$d */
    /* JADX INFO: compiled from: ShareInternalUtility.java */
    public static class d implements Utility.c<NativeAppCallAttachmentStore.b, String> {
        @Override // p007c.p165l.p178k0.Utility.c
        public String apply(NativeAppCallAttachmentStore.b bVar) {
            return bVar.f5051b;
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.r$e */
    /* JADX INFO: compiled from: ShareInternalUtility.java */
    public static class e implements OpenGraphJSONUtility {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f5240a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f5241b;

        public e(UUID uuid, ArrayList arrayList) {
            this.f5240a = uuid;
            this.f5241b = arrayList;
        }

        @Override // p007c.p165l.p183m0.p184b.OpenGraphJSONUtility
        /* JADX INFO: renamed from: a */
        public JSONObject mo2618a(SharePhoto sharePhoto) {
            NativeAppCallAttachmentStore.b bVarM2633a = ShareInternalUtility4.m2633a(this.f5240a, sharePhoto);
            if (bVarM2633a == null) {
                return null;
            }
            this.f5241b.add(bVarM2633a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", bVarM2633a.f5051b);
                if (sharePhoto.f5312i) {
                    jSONObject.put("user_generated", true);
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static NativeAppCallAttachmentStore.b m2633a(UUID uuid, ShareMedia shareMedia) {
        Bitmap bitmap;
        Uri uri;
        Uri uri2 = null;
        Bitmap bitmap2 = null;
        if (!(shareMedia instanceof SharePhoto)) {
            if (shareMedia instanceof ShareVideo) {
                uri = ((ShareVideo) shareMedia).f5324g;
            } else {
                bitmap = null;
            }
            return m2634b(uuid, uri2, bitmap);
        }
        SharePhoto sharePhoto = (SharePhoto) shareMedia;
        bitmap2 = sharePhoto.f5310g;
        uri = sharePhoto.f5311h;
        Bitmap bitmap3 = bitmap2;
        uri2 = uri;
        bitmap = bitmap3;
        return m2634b(uuid, uri2, bitmap);
    }

    /* JADX INFO: renamed from: b */
    public static NativeAppCallAttachmentStore.b m2634b(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            String str = NativeAppCallAttachmentStore.f5048a;
            Validate.m2477f(uuid, "callId");
            Validate.m2477f(bitmap, "attachmentBitmap");
            return new NativeAppCallAttachmentStore.b(uuid, bitmap, null, null);
        }
        if (uri == null) {
            return null;
        }
        String str2 = NativeAppCallAttachmentStore.f5048a;
        Validate.m2477f(uuid, "callId");
        Validate.m2477f(uri, "attachmentUri");
        return new NativeAppCallAttachmentStore.b(uuid, null, uri, null);
    }

    /* JADX INFO: renamed from: c */
    public static Pair<String, String> m2635c(String str) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1 || str.length() <= (i = iIndexOf + 1)) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(i);
        }
        return new Pair<>(strSubstring, str);
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m2636d(SharePhotoContent sharePhotoContent, UUID uuid) {
        List<SharePhoto> list = sharePhotoContent.f5318l;
        if (list == null) {
            return null;
        }
        List listM2430C = Utility.m2430C(list, new c(uuid));
        List<String> listM2430C2 = Utility.m2430C(listM2430C, new d());
        NativeAppCallAttachmentStore.m2533a(listM2430C);
        return listM2430C2;
    }

    /* JADX INFO: renamed from: e */
    public static String m2637e(Uri uri) {
        String string;
        int iLastIndexOf;
        if (uri == null || (iLastIndexOf = (string = uri.toString()).lastIndexOf(46)) == -1) {
            return null;
        }
        return string.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2638f(int i, int i2, Intent intent, ResultProcessor resultProcessor) {
        AppCall appCall;
        Bundle bundle;
        UUID uuidM2542f = NativeProtocol.m2542f(intent);
        if (uuidM2542f == null) {
            appCall = null;
        } else {
            synchronized (AppCall.class) {
                appCall = AppCall.f4873a;
                if (appCall != null && appCall.f4874b.equals(uuidM2542f) && appCall.f4876d == i) {
                    AppCall.m2414a(null);
                } else {
                    appCall = null;
                }
            }
        }
        if (appCall == null) {
            return false;
        }
        File fileM2536d = NativeAppCallAttachmentStore.m2536d(appCall.f4874b, false);
        if (fileM2536d != null) {
            Utility.m2448g(fileM2536d);
        }
        Bundle bundleM2541e = NativeProtocol.m2541e(intent);
        if (bundleM2541e != null ? bundleM2541e.containsKey("error") : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE")) {
            Bundle bundleM2541e2 = NativeProtocol.m2541e(intent);
            bundle = bundleM2541e2 != null ? bundleM2541e2.getBundle("error") : intent.getExtras();
        } else {
            bundle = null;
        }
        FacebookException facebookExceptionM2543g = NativeProtocol.m2543g(bundle);
        if (facebookExceptionM2543g == null) {
            int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            Bundle extras = intent.getExtras();
            if (NativeProtocol.m2547k(intExtra) && extras != null) {
                extras = extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            resultProcessor.mo2620b(appCall, extras);
        } else if (facebookExceptionM2543g instanceof FacebookOperationCanceledException) {
            FacebookCallback facebookCallback = ((ShareInternalUtility3) resultProcessor).f5235b;
            m2639g("cancelled", null);
            if (facebookCallback != null) {
                facebookCallback.mo2277b();
            }
        } else {
            resultProcessor.mo2619a(appCall, facebookExceptionM2543g);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m2639g(String str, String str2) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.f5360i);
        Bundle bundleM1575Z = outline.m1575Z("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundleM1575Z.putString("error_message", str2);
        }
        internalAppEventsLogger.m2370c("fb_share_dialog_result", bundleM1575Z);
    }

    /* JADX INFO: renamed from: h */
    public static GraphRequest2 m2640h(AccessToken accessToken, Uri uri, GraphRequest2.c cVar) throws FileNotFoundException {
        HttpMethod httpMethod = HttpMethod.POST;
        if (Utility.m2465x(uri)) {
            GraphRequest2.g gVar = new GraphRequest2.g(ParcelFileDescriptor.open(new File(uri.getPath()), 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new GraphRequest2(accessToken, "me/staging_resources", bundle, httpMethod, cVar);
        }
        if (!Utility.m2464w(uri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest2.g gVar2 = new GraphRequest2.g(uri, "image/png");
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", gVar2);
        return new GraphRequest2(accessToken, "me/staging_resources", bundle2, httpMethod, cVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m2641i(int i, CallbackManager callbackManager, FacebookCallback<Sharer> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        CallbackManagerImpl callbackManagerImpl = (CallbackManagerImpl) callbackManager;
        b bVar = new b(i, facebookCallback);
        Objects.requireNonNull(callbackManagerImpl);
        Validate.m2477f(bVar, "callback");
        callbackManagerImpl.f4908b.put(Integer.valueOf(i), bVar);
    }

    /* JADX INFO: renamed from: j */
    public static void m2642j(int i) {
        CallbackManagerImpl.m2425b(i, new a(i));
    }

    /* JADX INFO: renamed from: k */
    public static JSONArray m2643k(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objM2644l = jSONArray.get(i);
            if (objM2644l instanceof JSONArray) {
                objM2644l = m2643k((JSONArray) objM2644l, z);
            } else if (objM2644l instanceof JSONObject) {
                objM2644l = m2644l((JSONObject) objM2644l, z);
            }
            jSONArray2.put(objM2644l);
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: l */
    public static JSONObject m2644l(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArrayNames = jSONObject.names();
            for (int i = 0; i < jSONArrayNames.length(); i++) {
                String string = jSONArrayNames.getString(i);
                Object objM2643k = jSONObject.get(string);
                if (objM2643k instanceof JSONObject) {
                    objM2643k = m2644l((JSONObject) objM2643k, true);
                } else if (objM2643k instanceof JSONArray) {
                    objM2643k = m2643k((JSONArray) objM2643k, true);
                }
                Pair<String, String> pairM2635c = m2635c(string);
                String str = (String) pairM2635c.first;
                String str2 = (String) pairM2635c.second;
                if (z) {
                    if (str != null && str.equals("fbsdk")) {
                        jSONObject2.put(string, objM2643k);
                    } else if (str == null || str.equals("og")) {
                        jSONObject2.put(str2, objM2643k);
                    } else {
                        jSONObject3.put(str2, objM2643k);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, objM2643k);
                } else {
                    jSONObject2.put(string, objM2643k);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m2645m(UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        HashSet hashSet;
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f5306l;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectM2382I = C1095a.m2382I(shareOpenGraphAction, new e(uuid, arrayList));
        NativeAppCallAttachmentStore.m2533a(arrayList);
        if (shareOpenGraphContent.f5257h != null && Utility.m2466y(jSONObjectM2382I.optString("place"))) {
            jSONObjectM2382I.put("place", shareOpenGraphContent.f5257h);
        }
        if (shareOpenGraphContent.f5256g != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectM2382I.optJSONArray("tags");
            if (jSONArrayOptJSONArray == null) {
                hashSet = new HashSet();
            } else {
                HashSet hashSet2 = new HashSet();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    hashSet2.add(jSONArrayOptJSONArray.getString(i));
                }
                hashSet = hashSet2;
            }
            Iterator<String> it = shareOpenGraphContent.f5256g.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            jSONObjectM2382I.put("tags", new JSONArray((Collection) hashSet));
        }
        return jSONObjectM2382I;
    }
}
