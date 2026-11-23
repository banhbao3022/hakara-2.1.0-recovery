package p007c.p165l.p182l0;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.p176j0.p177a.DeviceRequestsHelper2;

/* JADX INFO: renamed from: c.l.l0.d, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthDialog2 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DeviceAuthDialog f5097a;

    public DeviceAuthDialog2(DeviceAuthDialog deviceAuthDialog) {
        this.f5097a = deviceAuthDialog;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        if (this.f5097a.f5086x0.get()) {
            return;
        }
        FacebookRequestError facebookRequestError = graphResponse.f5409d;
        if (facebookRequestError == null) {
            try {
                JSONObject jSONObject = graphResponse.f5408c;
                DeviceAuthDialog.m2561d1(this.f5097a, jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e) {
                this.f5097a.m2565h1(new FacebookException(e));
                return;
            }
        }
        int i = facebookRequestError.f5178j;
        if (i != 1349152) {
            switch (i) {
                case 1349172:
                case 1349174:
                    this.f5097a.m2567j1();
                    break;
                case 1349173:
                    this.f5097a.m2564g1();
                    break;
                default:
                    this.f5097a.m2565h1(facebookRequestError.f5184p);
                    break;
            }
            return;
        }
        if (this.f5097a.f5077A0 != null) {
            DeviceRequestsHelper2.m2411a(this.f5097a.f5077A0.f5093g);
        }
        DeviceAuthDialog deviceAuthDialog = this.f5097a;
        LoginClient.d dVar = deviceAuthDialog.f5081E0;
        if (dVar != null) {
            deviceAuthDialog.m2569l1(dVar);
        } else {
            deviceAuthDialog.m2564g1();
        }
    }
}
