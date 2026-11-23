package p007c.p165l.p183m0.p184b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.p185c.CameraEffectTextures;
import p007c.p165l.p183m0.p185c.ShareCameraEffectContent;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareHashtag;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareMedia;
import p007c.p165l.p183m0.p185c.ShareMediaContent;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerMediaTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerOpenGraphMusicTemplateContent;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p007c.p165l.p183m0.p185c.SharePhotoContent;
import p007c.p165l.p183m0.p185c.ShareStoryContent;
import p007c.p165l.p183m0.p185c.ShareVideo;
import p007c.p165l.p183m0.p185c.ShareVideoContent;

/* JADX INFO: renamed from: c.l.m0.b.h, reason: use source file name */
/* JADX INFO: compiled from: NativeDialogParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class NativeDialogParameters {
    /* JADX INFO: renamed from: a */
    public static Bundle m2616a(UUID uuid, ShareContent shareContent, boolean z) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundleM2617b;
        Validate.m2477f(shareContent, "shareContent");
        Validate.m2477f(uuid, "callId");
        String str = null;
        List listM2430C = null;
        Bundle bundle3 = null;
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle bundleM2617b2 = m2617b(shareLinkContent, z);
            Utility.m2434G(bundleM2617b2, "TITLE", shareLinkContent.f5270m);
            Utility.m2434G(bundleM2617b2, "DESCRIPTION", shareLinkContent.f5269l);
            Utility.m2435H(bundleM2617b2, "IMAGE", shareLinkContent.f5271n);
            Utility.m2434G(bundleM2617b2, "QUOTE", shareLinkContent.f5272o);
            Utility.m2435H(bundleM2617b2, "MESSENGER_LINK", shareLinkContent.f5255f);
            Utility.m2435H(bundleM2617b2, "TARGET_DISPLAY", shareLinkContent.f5255f);
            return bundleM2617b2;
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> listM2636d = ShareInternalUtility4.m2636d(sharePhotoContent, uuid);
            Bundle bundleM2617b3 = m2617b(sharePhotoContent, z);
            bundleM2617b3.putStringArrayList("PHOTOS", new ArrayList<>(listM2636d));
            return bundleM2617b3;
        }
        if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            ShareVideo shareVideo = shareVideoContent.f5329o;
            if (shareVideo != null) {
                Uri uri = shareVideo.f5324g;
                String str2 = NativeAppCallAttachmentStore.f5048a;
                Validate.m2477f(uuid, "callId");
                Validate.m2477f(uri, "attachmentUri");
                NativeAppCallAttachmentStore.b bVar = new NativeAppCallAttachmentStore.b(uuid, null, uri, null);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(bVar);
                NativeAppCallAttachmentStore.m2533a(arrayList);
                str = bVar.f5051b;
            }
            bundleM2617b = m2617b(shareVideoContent, z);
            Utility.m2434G(bundleM2617b, "TITLE", shareVideoContent.f5327m);
            Utility.m2434G(bundleM2617b, "DESCRIPTION", shareVideoContent.f5326l);
            Utility.m2434G(bundleM2617b, "VIDEO", str);
        } else {
            if (shareContent instanceof ShareOpenGraphContent) {
                ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
                try {
                    JSONObject jSONObjectM2644l = ShareInternalUtility4.m2644l(ShareInternalUtility4.m2645m(uuid, shareOpenGraphContent), false);
                    Bundle bundleM2617b4 = m2617b(shareOpenGraphContent, z);
                    Utility.m2434G(bundleM2617b4, "PREVIEW_PROPERTY_NAME", (String) ShareInternalUtility4.m2635c(shareOpenGraphContent.f5307m).second);
                    Utility.m2434G(bundleM2617b4, "ACTION_TYPE", shareOpenGraphContent.f5306l.m2649c());
                    Utility.m2434G(bundleM2617b4, "ACTION", jSONObjectM2644l.toString());
                    return bundleM2617b4;
                } catch (JSONException e) {
                    StringBuilder sbM1556G = outline.m1556G("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                    sbM1556G.append(e.getMessage());
                    throw new FacebookException(sbM1556G.toString());
                }
            }
            if (shareContent instanceof ShareMediaContent) {
                ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
                List<ShareMedia> list = shareMediaContent.f5275l;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    listM2430C = Utility.m2430C(list, new ShareInternalUtility5(uuid, arrayList2));
                    NativeAppCallAttachmentStore.m2533a(arrayList2);
                }
                bundleM2617b = m2617b(shareMediaContent, z);
                bundleM2617b.putParcelableArrayList("MEDIA", new ArrayList<>(listM2430C));
            } else {
                if (!(shareContent instanceof ShareCameraEffectContent)) {
                    if (shareContent instanceof ShareMessengerGenericTemplateContent) {
                        ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent = (ShareMessengerGenericTemplateContent) shareContent;
                        Bundle bundleM2617b5 = m2617b(shareMessengerGenericTemplateContent, z);
                        try {
                            MessengerShareContentUtility.m2611b(bundleM2617b5, shareMessengerGenericTemplateContent);
                            return bundleM2617b5;
                        } catch (JSONException e2) {
                            StringBuilder sbM1556G2 = outline.m1556G("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
                            sbM1556G2.append(e2.getMessage());
                            throw new FacebookException(sbM1556G2.toString());
                        }
                    }
                    if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                        ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent = (ShareMessengerOpenGraphMusicTemplateContent) shareContent;
                        Bundle bundleM2617b6 = m2617b(shareMessengerOpenGraphMusicTemplateContent, z);
                        try {
                            MessengerShareContentUtility.m2613d(bundleM2617b6, shareMessengerOpenGraphMusicTemplateContent);
                            return bundleM2617b6;
                        } catch (JSONException e3) {
                            StringBuilder sbM1556G3 = outline.m1556G("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
                            sbM1556G3.append(e3.getMessage());
                            throw new FacebookException(sbM1556G3.toString());
                        }
                    }
                    if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                        ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent = (ShareMessengerMediaTemplateContent) shareContent;
                        Bundle bundleM2617b7 = m2617b(shareMessengerMediaTemplateContent, z);
                        try {
                            MessengerShareContentUtility.m2612c(bundleM2617b7, shareMessengerMediaTemplateContent);
                            return bundleM2617b7;
                        } catch (JSONException e4) {
                            StringBuilder sbM1556G4 = outline.m1556G("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
                            sbM1556G4.append(e4.getMessage());
                            throw new FacebookException(sbM1556G4.toString());
                        }
                    }
                    if (!(shareContent instanceof ShareStoryContent)) {
                        return null;
                    }
                    ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
                    if (shareStoryContent.f5320l == null) {
                        bundle = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(shareStoryContent.f5320l);
                        ArrayList arrayList4 = new ArrayList();
                        List listM2430C2 = Utility.m2430C(arrayList3, new ShareInternalUtility2(uuid, arrayList4));
                        NativeAppCallAttachmentStore.m2533a(arrayList4);
                        bundle = (Bundle) listM2430C2.get(0);
                    }
                    if (shareStoryContent.f5321m == null) {
                        bundle2 = null;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(shareStoryContent.f5321m);
                        List listM2430C3 = Utility.m2430C(arrayList5, new ShareInternalUtility7(uuid));
                        List listM2430C4 = Utility.m2430C(listM2430C3, new ShareInternalUtility());
                        NativeAppCallAttachmentStore.m2533a(listM2430C3);
                        bundle2 = (Bundle) listM2430C4.get(0);
                    }
                    Bundle bundleM2617b8 = m2617b(shareStoryContent, z);
                    if (bundle != null) {
                        bundleM2617b8.putParcelable("bg_asset", bundle);
                    }
                    if (bundle2 != null) {
                        bundleM2617b8.putParcelable("interactive_asset_uri", bundle2);
                    }
                    List<String> list2 = shareStoryContent.f5322n;
                    List listUnmodifiableList = list2 != null ? Collections.unmodifiableList(list2) : null;
                    if (!Utility.m2467z(listUnmodifiableList)) {
                        bundleM2617b8.putStringArrayList("top_background_color_list", new ArrayList<>(listUnmodifiableList));
                    }
                    Utility.m2434G(bundleM2617b8, "content_url", shareStoryContent.f5323o);
                    return bundleM2617b8;
                }
                ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
                CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.f5254n;
                if (cameraEffectTextures != null) {
                    Bundle bundle4 = new Bundle();
                    ArrayList arrayList6 = new ArrayList();
                    for (String str3 : cameraEffectTextures.f5250f.keySet()) {
                        Object obj = cameraEffectTextures.f5250f.get(str3);
                        Uri uri2 = obj instanceof Uri ? (Uri) obj : null;
                        Object obj2 = cameraEffectTextures.f5250f.get(str3);
                        NativeAppCallAttachmentStore.b bVarM2634b = ShareInternalUtility4.m2634b(uuid, uri2, obj2 instanceof Bitmap ? (Bitmap) obj2 : null);
                        arrayList6.add(bVarM2634b);
                        bundle4.putString(str3, bVarM2634b.f5051b);
                    }
                    NativeAppCallAttachmentStore.m2533a(arrayList6);
                    bundle3 = bundle4;
                }
                bundleM2617b = m2617b(shareCameraEffectContent, z);
                Utility.m2434G(bundleM2617b, "effect_id", shareCameraEffectContent.f5252l);
                if (bundle3 != null) {
                    bundleM2617b.putBundle("effect_textures", bundle3);
                }
                try {
                    JSONObject jSONObjectM2603a = CameraEffectJSONUtility.m2603a(shareCameraEffectContent.f5253m);
                    if (jSONObjectM2603a != null) {
                        Utility.m2434G(bundleM2617b, "effect_arguments", jSONObjectM2603a.toString());
                    }
                } catch (JSONException e5) {
                    StringBuilder sbM1556G5 = outline.m1556G("Unable to create a JSON Object from the provided CameraEffectArguments: ");
                    sbM1556G5.append(e5.getMessage());
                    throw new FacebookException(sbM1556G5.toString());
                }
            }
        }
        return bundleM2617b;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2617b(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        Utility.m2435H(bundle, "LINK", shareContent.f5255f);
        Utility.m2434G(bundle, "PLACE", shareContent.f5257h);
        Utility.m2434G(bundle, "PAGE", shareContent.f5258i);
        Utility.m2434G(bundle, "REF", shareContent.f5259j);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f5256g;
        if (!Utility.m2467z(list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        ShareHashtag shareHashtag = shareContent.f5260k;
        if (shareHashtag != null) {
            Utility.m2434G(bundle, "HASHTAG", shareHashtag.f5267f);
        }
        return bundle;
    }
}
