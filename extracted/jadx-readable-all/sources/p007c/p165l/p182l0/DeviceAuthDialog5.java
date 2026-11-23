package p007c.p165l.p182l0;

import android.app.AlertDialog;
import java.util.Date;
import java.util.HashSet;
import mtp.media.karaoke.R;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p176j0.p177a.DeviceRequestsHelper2;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.SmartLoginOption;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.l0.g, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthDialog5 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f5105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Date f5106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Date f5107c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DeviceAuthDialog f5108d;

    public DeviceAuthDialog5(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2) {
        this.f5108d = deviceAuthDialog;
        this.f5105a = str;
        this.f5106b = date;
        this.f5107c = date2;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        if (this.f5108d.f5086x0.get()) {
            return;
        }
        FacebookRequestError facebookRequestError = graphResponse.f5409d;
        if (facebookRequestError != null) {
            this.f5108d.m2565h1(facebookRequestError.f5184p);
            return;
        }
        try {
            JSONObject jSONObject = graphResponse.f5408c;
            String string = jSONObject.getString("id");
            Utility.d dVarM2459r = Utility.m2459r(jSONObject);
            String string2 = jSONObject.getString("name");
            DeviceRequestsHelper2.m2411a(this.f5108d.f5077A0.f5093g);
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            if (FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c).f5003c.contains(SmartLoginOption.RequireConfirm)) {
                DeviceAuthDialog deviceAuthDialog = this.f5108d;
                if (!deviceAuthDialog.f5080D0) {
                    deviceAuthDialog.f5080D0 = true;
                    String str = this.f5105a;
                    Date date = this.f5106b;
                    Date date2 = this.f5107c;
                    String string3 = deviceAuthDialog.m16539M().getString(R.string.com_facebook_smart_login_confirmation_title);
                    String string4 = deviceAuthDialog.m16539M().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    String string5 = deviceAuthDialog.m16539M().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    String str2 = String.format(string4, string2);
                    AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.m16571x());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(str2, new DeviceAuthDialog4(deviceAuthDialog, string, dVarM2459r, str, date, date2)).setPositiveButton(string5, new DeviceAuthDialog3(deviceAuthDialog));
                    builder.create().show();
                    return;
                }
            }
            DeviceAuthDialog.m2562e1(this.f5108d, string, dVarM2459r, this.f5105a, this.f5106b, this.f5107c);
        } catch (JSONException e) {
            this.f5108d.m2565h1(new FacebookException(e));
        }
    }
}
