package p007c.p165l.p183m0.p186d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p175i0.C1095a;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.CallbackManagerImpl;
import p007c.p165l.p178k0.DialogFeature;
import p007c.p165l.p178k0.DialogPresenter;
import p007c.p165l.p178k0.FacebookDialogBase;
import p007c.p165l.p178k0.FragmentWrapper;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.Sharer;
import p007c.p165l.p183m0.p184b.CameraEffectFeature;
import p007c.p165l.p183m0.p184b.OpenGraphActionDialogFeature;
import p007c.p165l.p183m0.p184b.ShareContentValidation;
import p007c.p165l.p183m0.p184b.ShareDialogFeature;
import p007c.p165l.p183m0.p184b.ShareFeedContent;
import p007c.p165l.p183m0.p184b.ShareInternalUtility4;
import p007c.p165l.p183m0.p184b.ShareInternalUtility6;
import p007c.p165l.p183m0.p184b.ShareStoryFeature;
import p007c.p165l.p183m0.p184b.WebDialogParameters;
import p007c.p165l.p183m0.p184b.WebDialogParameters2;
import p007c.p165l.p183m0.p185c.ShareCameraEffectContent;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareHashtag;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareMediaContent;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p007c.p165l.p183m0.p185c.SharePhoto;
import p007c.p165l.p183m0.p185c.SharePhotoContent;
import p007c.p165l.p183m0.p185c.ShareStoryContent;
import p007c.p165l.p183m0.p185c.ShareVideoContent;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.l.m0.d.c, reason: use source file name */
/* JADX INFO: compiled from: ShareDialog.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareDialog extends FacebookDialogBase<ShareContent, Sharer> {

    /* JADX INFO: renamed from: f */
    public static final int f5334f = C7804v0.m15318g(2);

    /* JADX INFO: renamed from: g */
    public boolean f5335g;

    /* JADX INFO: renamed from: c.l.m0.d.c$b */
    /* JADX INFO: compiled from: ShareDialog.java */
    public class b extends FacebookDialogBase<ShareContent, Sharer>.a {
        public b(a aVar) {
            super(ShareDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            ShareContent shareContent2 = shareContent;
            return (shareContent2 instanceof ShareCameraEffectContent) && ShareDialog.m2656g(shareContent2.getClass());
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            ShareContent shareContent2 = shareContent;
            if (ShareContentValidation.f5215b == null) {
                ShareContentValidation.f5215b = new ShareContentValidation.c(null);
            }
            ShareContentValidation.m2622b(shareContent2, ShareContentValidation.f5215b);
            AppCall appCallMo2495a = ShareDialog.this.mo2495a();
            Objects.requireNonNull(ShareDialog.this);
            DialogPresenter.m2482c(appCallMo2495a, new ShareDialog2(this, appCallMo2495a, shareContent2, false), ShareDialog.m2658i(shareContent2.getClass()));
            return appCallMo2495a;
        }
    }

    /* JADX INFO: renamed from: c.l.m0.d.c$c */
    /* JADX INFO: compiled from: ShareDialog.java */
    public class c extends FacebookDialogBase<ShareContent, Sharer>.a {
        public c(a aVar) {
            super(ShareDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            ShareContent shareContent2 = shareContent;
            return (shareContent2 instanceof ShareLinkContent) || (shareContent2 instanceof ShareFeedContent);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            Bundle bundle;
            ShareContent shareContent2 = shareContent;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.m2657h(shareDialog, shareDialog.m2496b(), shareContent2, d.FEED);
            AppCall appCallMo2495a = ShareDialog.this.mo2495a();
            if (shareContent2 instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent2;
                if (ShareContentValidation.f5214a == null) {
                    ShareContentValidation.f5214a = new ShareContentValidation.d(null);
                }
                ShareContentValidation.m2622b(shareLinkContent, ShareContentValidation.f5214a);
                bundle = new Bundle();
                Utility.m2434G(bundle, "name", shareLinkContent.f5270m);
                Utility.m2434G(bundle, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, shareLinkContent.f5269l);
                Utility.m2434G(bundle, "link", Utility.m2458q(shareLinkContent.f5255f));
                Utility.m2434G(bundle, "picture", Utility.m2458q(shareLinkContent.f5271n));
                Utility.m2434G(bundle, "quote", shareLinkContent.f5272o);
                ShareHashtag shareHashtag = shareLinkContent.f5260k;
                if (shareHashtag != null) {
                    Utility.m2434G(bundle, "hashtag", shareHashtag.f5267f);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent2;
                bundle = new Bundle();
                Utility.m2434G(bundle, "to", shareFeedContent.f5226l);
                Utility.m2434G(bundle, "link", shareFeedContent.f5227m);
                Utility.m2434G(bundle, "picture", shareFeedContent.f5231q);
                Utility.m2434G(bundle, "source", shareFeedContent.f5232r);
                Utility.m2434G(bundle, "name", shareFeedContent.f5228n);
                Utility.m2434G(bundle, "caption", shareFeedContent.f5229o);
                Utility.m2434G(bundle, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, shareFeedContent.f5230p);
            }
            DialogPresenter.m2484e(appCallMo2495a, "feed", bundle);
            return appCallMo2495a;
        }
    }

    /* JADX INFO: renamed from: c.l.m0.d.c$d */
    /* JADX INFO: compiled from: ShareDialog.java */
    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* JADX INFO: renamed from: c.l.m0.d.c$e */
    /* JADX INFO: compiled from: ShareDialog.java */
    public class e extends FacebookDialogBase<ShareContent, Sharer>.a {
        public e(a aVar) {
            super(ShareDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            boolean zM2480a;
            ShareContent shareContent2 = shareContent;
            if (shareContent2 == null || (shareContent2 instanceof ShareCameraEffectContent) || (shareContent2 instanceof ShareStoryContent)) {
                return false;
            }
            if (z) {
                zM2480a = true;
            } else {
                zM2480a = shareContent2.f5260k != null ? DialogPresenter.m2480a(ShareDialogFeature.HASHTAG) : true;
                if ((shareContent2 instanceof ShareLinkContent) && !Utility.m2466y(((ShareLinkContent) shareContent2).f5272o)) {
                    zM2480a &= DialogPresenter.m2480a(ShareDialogFeature.LINK_SHARE_QUOTES);
                }
            }
            return zM2480a && ShareDialog.m2656g(shareContent2.getClass());
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            ShareContent shareContent2 = shareContent;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.m2657h(shareDialog, shareDialog.m2496b(), shareContent2, d.NATIVE);
            if (ShareContentValidation.f5215b == null) {
                ShareContentValidation.f5215b = new ShareContentValidation.c(null);
            }
            ShareContentValidation.m2622b(shareContent2, ShareContentValidation.f5215b);
            AppCall appCallMo2495a = ShareDialog.this.mo2495a();
            Objects.requireNonNull(ShareDialog.this);
            DialogPresenter.m2482c(appCallMo2495a, new ShareDialog3(this, appCallMo2495a, shareContent2, false), ShareDialog.m2658i(shareContent2.getClass()));
            return appCallMo2495a;
        }
    }

    /* JADX INFO: renamed from: c.l.m0.d.c$f */
    /* JADX INFO: compiled from: ShareDialog.java */
    public class f extends FacebookDialogBase<ShareContent, Sharer>.a {
        public f(a aVar) {
            super(ShareDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            ShareContent shareContent2 = shareContent;
            return (shareContent2 instanceof ShareStoryContent) && ShareDialog.m2656g(shareContent2.getClass());
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            ShareContent shareContent2 = shareContent;
            if (ShareContentValidation.f5216c == null) {
                ShareContentValidation.f5216c = new ShareContentValidation.b(null);
            }
            ShareContentValidation.m2622b(shareContent2, ShareContentValidation.f5216c);
            AppCall appCallMo2495a = ShareDialog.this.mo2495a();
            Objects.requireNonNull(ShareDialog.this);
            DialogPresenter.m2482c(appCallMo2495a, new ShareDialog4(this, appCallMo2495a, shareContent2, false), ShareDialog.m2658i(shareContent2.getClass()));
            return appCallMo2495a;
        }
    }

    /* JADX INFO: renamed from: c.l.m0.d.c$g */
    /* JADX INFO: compiled from: ShareDialog.java */
    public class g extends FacebookDialogBase<ShareContent, Sharer>.a {
        public g(a aVar) {
            super(ShareDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            boolean z2;
            ShareContent shareContent2 = shareContent;
            if (shareContent2 == null) {
                return false;
            }
            Class<?> cls = shareContent2.getClass();
            if (ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.m2248c())) {
                if (shareContent2 instanceof ShareOpenGraphContent) {
                    try {
                        C1095a.m2382I(((ShareOpenGraphContent) shareContent2).f5306l, new ShareInternalUtility6());
                    } catch (Exception unused) {
                        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                        z2 = false;
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            return z2;
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            Bundle bundleM2646a;
            ShareContent shareContent2 = shareContent;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.m2657h(shareDialog, shareDialog.m2496b(), shareContent2, d.WEB);
            AppCall appCallMo2495a = ShareDialog.this.mo2495a();
            String str = null;
            if (ShareContentValidation.f5214a == null) {
                ShareContentValidation.f5214a = new ShareContentValidation.d(null);
            }
            ShareContentValidation.m2622b(shareContent2, ShareContentValidation.f5214a);
            boolean z = shareContent2 instanceof ShareLinkContent;
            if (z) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent2;
                bundleM2646a = WebDialogParameters2.m2647b(shareLinkContent);
                Utility.m2435H(bundleM2646a, "href", shareLinkContent.f5255f);
                Utility.m2434G(bundleM2646a, "quote", shareLinkContent.f5272o);
            } else if (shareContent2 instanceof SharePhotoContent) {
                SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent2;
                UUID uuid = appCallMo2495a.f4874b;
                SharePhotoContent.b bVar = new SharePhotoContent.b();
                bVar.f5261a = sharePhotoContent.f5255f;
                List<String> list = sharePhotoContent.f5256g;
                bVar.f5262b = list == null ? null : Collections.unmodifiableList(list);
                bVar.f5263c = sharePhotoContent.f5257h;
                bVar.f5264d = sharePhotoContent.f5258i;
                bVar.f5265e = sharePhotoContent.f5259j;
                bVar.f5266f = sharePhotoContent.f5260k;
                bVar.m2654a(sharePhotoContent.f5318l);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < sharePhotoContent.f5318l.size(); i++) {
                    SharePhoto sharePhotoM2652a = sharePhotoContent.f5318l.get(i);
                    Bitmap bitmap = sharePhotoM2652a.f5310g;
                    if (bitmap != null) {
                        String str2 = NativeAppCallAttachmentStore.f5048a;
                        Validate.m2477f(uuid, "callId");
                        Validate.m2477f(bitmap, "attachmentBitmap");
                        NativeAppCallAttachmentStore.b bVar2 = new NativeAppCallAttachmentStore.b(uuid, bitmap, null, null);
                        SharePhoto.b bVarM2653b = new SharePhoto.b().m2653b(sharePhotoM2652a);
                        bVarM2653b.f5315c = Uri.parse(bVar2.f5051b);
                        bVarM2653b.f5314b = null;
                        sharePhotoM2652a = bVarM2653b.m2652a();
                        arrayList2.add(bVar2);
                    }
                    arrayList.add(sharePhotoM2652a);
                }
                bVar.f5319g.clear();
                bVar.m2654a(arrayList);
                NativeAppCallAttachmentStore.m2533a(arrayList2);
                ShareHashtag shareHashtag = bVar.f5266f;
                List listUnmodifiableList = Collections.unmodifiableList(bVar.f5319g);
                Bundle bundle = new Bundle();
                if (shareHashtag != null) {
                    Utility.m2434G(bundle, "hashtag", shareHashtag.f5267f);
                }
                String[] strArr = new String[listUnmodifiableList.size()];
                Utility.m2430C(listUnmodifiableList, new WebDialogParameters()).toArray(strArr);
                bundle.putStringArray("media", strArr);
                bundleM2646a = bundle;
            } else {
                bundleM2646a = WebDialogParameters2.m2646a((ShareOpenGraphContent) shareContent2);
            }
            if (z || (shareContent2 instanceof SharePhotoContent)) {
                str = "share";
            } else if (shareContent2 instanceof ShareOpenGraphContent) {
                str = "share_open_graph";
            }
            DialogPresenter.m2484e(appCallMo2495a, str, bundleM2646a);
            return appCallMo2495a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareDialog(Activity activity) {
        int i = f5334f;
        super(activity, i);
        this.f5335g = true;
        ShareInternalUtility4.m2642j(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2656g(Class cls) {
        DialogFeature dialogFeatureM2658i = m2658i(cls);
        return dialogFeatureM2658i != null && DialogPresenter.m2480a(dialogFeatureM2658i);
    }

    /* JADX INFO: renamed from: h */
    public static void m2657h(ShareDialog shareDialog, Context context, ShareContent shareContent, d dVar) {
        String str;
        if (shareDialog.f5335g) {
            dVar = d.AUTOMATIC;
        }
        int iOrdinal = dVar.ordinal();
        String str2 = "unknown";
        if (iOrdinal == 0) {
            str = "automatic";
        } else if (iOrdinal != 1) {
            str = iOrdinal != 2 ? "unknown" : "web";
        } else {
            str = "native";
        }
        DialogFeature dialogFeatureM2658i = m2658i(shareContent.getClass());
        if (dialogFeatureM2658i == ShareDialogFeature.SHARE_DIALOG) {
            str2 = "status";
        } else if (dialogFeatureM2658i == ShareDialogFeature.PHOTOS) {
            str2 = "photo";
        } else if (dialogFeatureM2658i == ShareDialogFeature.VIDEO) {
            str2 = "video";
        } else if (dialogFeatureM2658i == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        internalAppEventsLogger.m2370c("fb_share_dialog_show", bundle);
    }

    /* JADX INFO: renamed from: i */
    public static DialogFeature m2658i(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
        }
        return null;
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: a */
    public AppCall mo2495a() {
        return new AppCall(this.f4952e);
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: c */
    public List<FacebookDialogBase<ShareContent, Sharer>.a> mo2497c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(null));
        arrayList.add(new c(null));
        arrayList.add(new g(null));
        arrayList.add(new b(null));
        arrayList.add(new f(null));
        return arrayList;
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: e */
    public void mo2499e(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer> facebookCallback) {
        ShareInternalUtility4.m2641i(this.f4952e, callbackManagerImpl, facebookCallback);
    }

    public ShareDialog(Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper(fragment);
        int i = f5334f;
        super(fragmentWrapper, i);
        this.f5335g = true;
        ShareInternalUtility4.m2642j(i);
    }

    public ShareDialog(android.app.Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper(fragment);
        int i = f5334f;
        super(fragmentWrapper, i);
        this.f5335g = true;
        ShareInternalUtility4.m2642j(i);
    }
}
