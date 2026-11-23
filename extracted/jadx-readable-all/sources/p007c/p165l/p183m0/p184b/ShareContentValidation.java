package p007c.p165l.p183m0.p184b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.p185c.ShareCameraEffectContent;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareMedia;
import p007c.p165l.p183m0.p185c.ShareMediaContent;
import p007c.p165l.p183m0.p185c.ShareMessengerActionButton;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateElement;
import p007c.p165l.p183m0.p185c.ShareMessengerMediaTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerOpenGraphMusicTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerURLActionButton;
import p007c.p165l.p183m0.p185c.ShareOpenGraphAction;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p007c.p165l.p183m0.p185c.ShareOpenGraphObject;
import p007c.p165l.p183m0.p185c.ShareOpenGraphValueContainer;
import p007c.p165l.p183m0.p185c.SharePhoto;
import p007c.p165l.p183m0.p185c.SharePhotoContent;
import p007c.p165l.p183m0.p185c.ShareStoryContent;
import p007c.p165l.p183m0.p185c.ShareVideo;
import p007c.p165l.p183m0.p185c.ShareVideoContent;

/* JADX INFO: renamed from: c.l.m0.b.l, reason: use source file name */
/* JADX INFO: compiled from: ShareContentValidation.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareContentValidation {

    /* JADX INFO: renamed from: a */
    public static c f5214a;

    /* JADX INFO: renamed from: b */
    public static c f5215b;

    /* JADX INFO: renamed from: c */
    public static c f5216c;

    /* JADX INFO: renamed from: c.l.m0.b.l$b */
    /* JADX INFO: compiled from: ShareContentValidation.java */
    public static class b extends c {
        public b(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p183m0.p184b.ShareContentValidation.c
        /* JADX INFO: renamed from: e */
        public void mo2626e(ShareStoryContent shareStoryContent) {
            ShareContentValidation.m2621a(shareStoryContent, this);
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.l$c */
    /* JADX INFO: compiled from: ShareContentValidation.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f5217a = false;

        public c(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public void m2627a(ShareMedia shareMedia) {
            if (shareMedia instanceof SharePhoto) {
                mo2630d((SharePhoto) shareMedia);
            } else {
                if (!(shareMedia instanceof ShareVideo)) {
                    throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", shareMedia.getClass().getSimpleName()));
                }
                m2631f((ShareVideo) shareMedia);
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo2628b(ShareMediaContent shareMediaContent) {
            List<ShareMedia> list = shareMediaContent.f5275l;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            }
            if (list.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", 6));
            }
            Iterator<ShareMedia> it = list.iterator();
            while (it.hasNext()) {
                m2627a(it.next());
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2629c(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            for (String str : shareOpenGraphValueContainer.m2651b()) {
                if (z) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length < 2) {
                        throw new FacebookException("Open Graph keys must be namespaced: %s", str);
                    }
                    for (String str2 : strArrSplit) {
                        if (str2.isEmpty()) {
                            throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                }
                Object objM2650a = shareOpenGraphValueContainer.m2650a(str);
                if (objM2650a instanceof List) {
                    for (Object obj : (List) objM2650a) {
                        if (obj == null) {
                            throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                        }
                        ShareContentValidation.m2623c(obj, this);
                    }
                } else {
                    ShareContentValidation.m2623c(objM2650a, this);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo2630d(SharePhoto sharePhoto) {
            ShareContentValidation.m2624d(sharePhoto);
            Bitmap bitmap = sharePhoto.f5310g;
            Uri uri = sharePhoto.f5311h;
            if (bitmap == null && Utility.m2428A(uri) && !this.f5217a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
            if (sharePhoto.f5310g == null && Utility.m2428A(sharePhoto.f5311h)) {
                return;
            }
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            Validate.m2477f(context, "context");
            String strM2472a = Validate.m2472a();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String strM1599u = outline.m1599u("com.facebook.app.FacebookContentProvider", strM2472a);
                if (packageManager.resolveContentProvider(strM1599u, 0) == null) {
                    throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", strM1599u));
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void mo2626e(ShareStoryContent shareStoryContent) {
            ShareContentValidation.m2621a(shareStoryContent, this);
        }

        /* JADX INFO: renamed from: f */
        public void m2631f(ShareVideo shareVideo) {
            if (shareVideo == null) {
                throw new FacebookException("Cannot share a null ShareVideo");
            }
            Uri uri = shareVideo.f5324g;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            }
            if (!Utility.m2464w(uri) && !Utility.m2465x(uri)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        }

        /* JADX INFO: renamed from: g */
        public void mo2632g(ShareVideoContent shareVideoContent) {
            m2631f(shareVideoContent.f5329o);
            SharePhoto sharePhoto = shareVideoContent.f5328n;
            if (sharePhoto != null) {
                mo2630d(sharePhoto);
            }
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.l$d */
    /* JADX INFO: compiled from: ShareContentValidation.java */
    public static class d extends c {
        public d(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p183m0.p184b.ShareContentValidation.c
        /* JADX INFO: renamed from: b */
        public void mo2628b(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // p007c.p165l.p183m0.p184b.ShareContentValidation.c
        /* JADX INFO: renamed from: d */
        public void mo2630d(SharePhoto sharePhoto) {
            ShareContentValidation.m2624d(sharePhoto);
        }

        @Override // p007c.p165l.p183m0.p184b.ShareContentValidation.c
        /* JADX INFO: renamed from: g */
        public void mo2632g(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2621a(ShareStoryContent shareStoryContent, c cVar) {
        ShareMedia shareMedia;
        if (shareStoryContent == null || ((shareMedia = shareStoryContent.f5320l) == null && shareStoryContent.f5321m == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareMedia != null) {
            cVar.m2627a(shareMedia);
        }
        SharePhoto sharePhoto = shareStoryContent.f5321m;
        if (sharePhoto != null) {
            cVar.mo2630d(sharePhoto);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2622b(ShareContent shareContent, c cVar) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            Objects.requireNonNull(cVar);
            Uri uri = ((ShareLinkContent) shareContent).f5271n;
            if (uri != null && !Utility.m2428A(uri)) {
                throw new FacebookException("Image Url must be an http:// or https:// url");
            }
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            Objects.requireNonNull(cVar);
            List<SharePhoto> list = ((SharePhotoContent) shareContent).f5318l;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            }
            if (list.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", 6));
            }
            Iterator<SharePhoto> it = list.iterator();
            while (it.hasNext()) {
                cVar.mo2630d(it.next());
            }
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            cVar.mo2632g((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            cVar.f5217a = true;
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f5306l;
            if (shareOpenGraphAction == null) {
                throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
            }
            if (Utility.m2466y(shareOpenGraphAction.m2649c())) {
                throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
            }
            cVar.m2629c(shareOpenGraphAction, false);
            String str = shareOpenGraphContent.f5307m;
            if (Utility.m2466y(str)) {
                throw new FacebookException("Must specify a previewPropertyName.");
            }
            if (shareOpenGraphContent.f5306l.m2650a(str) == null) {
                throw new FacebookException(outline.m1600v("Property \"", str, "\" was not found on the action. The name of the preview property must match the name of an action property."));
            }
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            cVar.mo2628b((ShareMediaContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            Objects.requireNonNull(cVar);
            if (Utility.m2466y(((ShareCameraEffectContent) shareContent).f5252l)) {
                throw new FacebookException("Must specify a non-empty effectId");
            }
            return;
        }
        if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent = (ShareMessengerOpenGraphMusicTemplateContent) shareContent;
            Objects.requireNonNull(cVar);
            if (Utility.m2466y(shareMessengerOpenGraphMusicTemplateContent.f5258i)) {
                throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
            }
            if (shareMessengerOpenGraphMusicTemplateContent.f5295l == null) {
                throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
            }
            m2625e(shareMessengerOpenGraphMusicTemplateContent.f5296m);
            return;
        }
        if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent = (ShareMessengerMediaTemplateContent) shareContent;
            Objects.requireNonNull(cVar);
            if (Utility.m2466y(shareMessengerMediaTemplateContent.f5258i)) {
                throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
            }
            if (shareMessengerMediaTemplateContent.f5290n == null && Utility.m2466y(shareMessengerMediaTemplateContent.f5289m)) {
                throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
            }
            m2625e(shareMessengerMediaTemplateContent.f5291o);
            return;
        }
        if (!(shareContent instanceof ShareMessengerGenericTemplateContent)) {
            if (shareContent instanceof ShareStoryContent) {
                cVar.mo2626e((ShareStoryContent) shareContent);
                return;
            }
            return;
        }
        ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent = (ShareMessengerGenericTemplateContent) shareContent;
        Objects.requireNonNull(cVar);
        if (Utility.m2466y(shareMessengerGenericTemplateContent.f5258i)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        }
        ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.f5279n;
        if (shareMessengerGenericTemplateElement == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        }
        if (Utility.m2466y(shareMessengerGenericTemplateElement.f5283f)) {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
        m2625e(shareMessengerGenericTemplateContent.f5279n.f5287j);
    }

    /* JADX INFO: renamed from: c */
    public static void m2623c(Object obj, c cVar) {
        if (!(obj instanceof ShareOpenGraphObject)) {
            if (obj instanceof SharePhoto) {
                cVar.mo2630d((SharePhoto) obj);
            }
        } else {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            Objects.requireNonNull(cVar);
            if (shareOpenGraphObject == null) {
                throw new FacebookException("Cannot share a null ShareOpenGraphObject");
            }
            cVar.m2629c(shareOpenGraphObject, true);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2624d(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.f5310g;
        Uri uri = sharePhoto.f5311h;
        if (bitmap == null && uri == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2625e(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        if (Utility.m2466y(shareMessengerActionButton.f5276f)) {
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if ((shareMessengerActionButton instanceof ShareMessengerURLActionButton) && ((ShareMessengerURLActionButton) shareMessengerActionButton).f5297g == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }
}
