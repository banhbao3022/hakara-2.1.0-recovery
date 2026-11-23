package p007c.p165l.p183m0.p184b;

import android.net.Uri;
import android.os.Bundle;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p183m0.p185c.ShareMessengerActionButton;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateElement;
import p007c.p165l.p183m0.p185c.ShareMessengerMediaTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerOpenGraphMusicTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerURLActionButton;

/* JADX INFO: renamed from: c.l.m0.b.g, reason: use source file name */
/* JADX INFO: compiled from: MessengerShareContentUtility.java */
/* JADX INFO: loaded from: classes.dex */
public class MessengerShareContentUtility {

    /* JADX INFO: renamed from: a */
    public static final Pattern f5209a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* JADX INFO: renamed from: a */
    public static void m2610a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        String strM2458q;
        if (shareMessengerActionButton != null && (shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            ShareMessengerURLActionButton shareMessengerURLActionButton = (ShareMessengerURLActionButton) shareMessengerActionButton;
            if (z) {
                strM2458q = Utility.m2458q(shareMessengerURLActionButton.f5297g);
            } else {
                strM2458q = shareMessengerURLActionButton.f5276f + " - " + Utility.m2458q(shareMessengerURLActionButton.f5297g);
            }
            Utility.m2434G(bundle, "TARGET_DISPLAY", strM2458q);
            Utility.m2435H(bundle, "ITEM_URL", shareMessengerURLActionButton.f5297g);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2611b(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.f5279n;
        ShareMessengerActionButton shareMessengerActionButton = shareMessengerGenericTemplateElement.f5287j;
        if (shareMessengerActionButton != null) {
            m2610a(bundle, shareMessengerActionButton, false);
        } else {
            ShareMessengerActionButton shareMessengerActionButton2 = shareMessengerGenericTemplateElement.f5286i;
            if (shareMessengerActionButton2 != null) {
                m2610a(bundle, shareMessengerActionButton2, true);
            }
        }
        Utility.m2435H(bundle, "IMAGE", shareMessengerGenericTemplateElement.f5285h);
        Utility.m2434G(bundle, "PREVIEW_TYPE", "DEFAULT");
        Utility.m2434G(bundle, "TITLE", shareMessengerGenericTemplateElement.f5283f);
        Utility.m2434G(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.f5284g);
        JSONArray jSONArray = new JSONArray();
        ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement2 = shareMessengerGenericTemplateContent.f5279n;
        JSONObject jSONObjectPut = new JSONObject().put(CainMediaMetadataRetriever.METADATA_KEY_TITLE, shareMessengerGenericTemplateElement2.f5283f).put("subtitle", shareMessengerGenericTemplateElement2.f5284g).put("image_url", Utility.m2458q(shareMessengerGenericTemplateElement2.f5285h));
        if (shareMessengerGenericTemplateElement2.f5287j != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(m2614e(shareMessengerGenericTemplateElement2.f5287j));
            jSONObjectPut.put("buttons", jSONArray2);
        }
        ShareMessengerActionButton shareMessengerActionButton3 = shareMessengerGenericTemplateElement2.f5286i;
        if (shareMessengerActionButton3 != null) {
            jSONObjectPut.put("default_action", m2615f(shareMessengerActionButton3, true));
        }
        JSONArray jSONArrayPut = jSONArray.put(jSONObjectPut);
        JSONObject jSONObjectPut2 = new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.f5277l);
        ShareMessengerGenericTemplateContent.b bVar = shareMessengerGenericTemplateContent.f5278m;
        Utility.m2433F(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", jSONObjectPut2.put("image_aspect_ratio", (bVar != null && bVar.ordinal() == 1) ? "square" : "horizontal").put("elements", jSONArrayPut))));
    }

    /* JADX INFO: renamed from: c */
    public static void m2612c(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        m2610a(bundle, shareMessengerMediaTemplateContent.f5291o, false);
        Utility.m2434G(bundle, "PREVIEW_TYPE", "DEFAULT");
        Utility.m2434G(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.f5289m);
        Uri uri = shareMessengerMediaTemplateContent.f5290n;
        if (uri != null) {
            String host = uri.getHost();
            Utility.m2435H(bundle, (Utility.m2466y(host) || !f5209a.matcher(host).matches()) ? "IMAGE" : "uri", shareMessengerMediaTemplateContent.f5290n);
        }
        ShareMessengerMediaTemplateContent.b bVar = shareMessengerMediaTemplateContent.f5288l;
        Utility.m2434G(bundle, "type", (bVar != null && bVar.ordinal() == 1) ? "video" : "image");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.f5289m).put("url", Utility.m2458q(shareMessengerMediaTemplateContent.f5290n));
        ShareMessengerMediaTemplateContent.b bVar2 = shareMessengerMediaTemplateContent.f5288l;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("media_type", (bVar2 == null || bVar2.ordinal() != 1) ? "image" : "video");
        if (shareMessengerMediaTemplateContent.f5291o != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(m2614e(shareMessengerMediaTemplateContent.f5291o));
            jSONObjectPut2.put("buttons", jSONArray2);
        }
        Utility.m2433F(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", jSONArray.put(jSONObjectPut2)))));
    }

    /* JADX INFO: renamed from: d */
    public static void m2613d(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        m2610a(bundle, shareMessengerOpenGraphMusicTemplateContent.f5296m, false);
        Utility.m2434G(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        Utility.m2435H(bundle, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.f5295l);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut = new JSONObject().put("url", Utility.m2458q(shareMessengerOpenGraphMusicTemplateContent.f5295l));
        if (shareMessengerOpenGraphMusicTemplateContent.f5296m != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(m2614e(shareMessengerOpenGraphMusicTemplateContent.f5296m));
            jSONObjectPut.put("buttons", jSONArray2);
        }
        Utility.m2433F(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", jSONArray.put(jSONObjectPut)))));
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m2614e(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        return m2615f(shareMessengerActionButton, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX INFO: renamed from: f */
    public static JSONObject m2615f(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        String str;
        if (!(shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            return null;
        }
        ShareMessengerURLActionButton shareMessengerURLActionButton = (ShareMessengerURLActionButton) shareMessengerActionButton;
        JSONObject jSONObjectPut = new JSONObject().put("type", "web_url").put(CainMediaMetadataRetriever.METADATA_KEY_TITLE, z ? null : shareMessengerURLActionButton.f5276f).put("url", Utility.m2458q(shareMessengerURLActionButton.f5297g));
        ShareMessengerURLActionButton.b bVar = shareMessengerURLActionButton.f5301k;
        if (bVar != null) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 1) {
                str = "tall";
            } else if (iOrdinal != 2) {
                str = "full";
            } else {
                str = "compact";
            }
        } else {
            str = "full";
        }
        return jSONObjectPut.put("webview_height_ratio", str).put("messenger_extensions", shareMessengerURLActionButton.f5299i).put("fallback_url", Utility.m2458q(shareMessengerURLActionButton.f5298h)).put("webview_share_button", shareMessengerURLActionButton.f5300j ? "hide" : null);
    }
}
