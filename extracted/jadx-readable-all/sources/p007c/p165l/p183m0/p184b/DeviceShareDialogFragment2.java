package p007c.p165l.p183m0.p184b;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;

/* JADX INFO: renamed from: c.l.m0.b.d, reason: use source file name */
/* JADX INFO: compiled from: DeviceShareDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceShareDialogFragment2 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DeviceShareDialogFragment f5200a;

    public DeviceShareDialogFragment2(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.f5200a = deviceShareDialogFragment;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        FacebookRequestError facebookRequestError = graphResponse.f5409d;
        if (facebookRequestError != null) {
            DeviceShareDialogFragment deviceShareDialogFragment = this.f5200a;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = DeviceShareDialogFragment.f5189s0;
            deviceShareDialogFragment.m2606e1(facebookRequestError);
            return;
        }
        JSONObject jSONObject = graphResponse.f5408c;
        DeviceShareDialogFragment.c cVar = new DeviceShareDialogFragment.c();
        try {
            cVar.f5198f = jSONObject.getString("user_code");
            cVar.f5199g = jSONObject.getLong("expires_in");
            DeviceShareDialogFragment deviceShareDialogFragment2 = this.f5200a;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = DeviceShareDialogFragment.f5189s0;
            deviceShareDialogFragment2.m2607f1(cVar);
        } catch (JSONException unused) {
            DeviceShareDialogFragment deviceShareDialogFragment3 = this.f5200a;
            FacebookRequestError facebookRequestError2 = new FacebookRequestError(0, "", "Malformed server response");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = DeviceShareDialogFragment.f5189s0;
            deviceShareDialogFragment3.m2606e1(facebookRequestError2);
        }
    }
}
