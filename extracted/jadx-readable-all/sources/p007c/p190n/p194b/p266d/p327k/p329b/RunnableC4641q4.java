package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4327r9;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4180h2;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4369u9;

/* JADX INFO: renamed from: c.n.b.d.k.b.q4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4641q4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4180h2 f24283f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnection f24284g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ServiceConnectionC4606n4 f24285h;

    public RunnableC4641q4(ServiceConnectionC4606n4 serviceConnectionC4606n4, InterfaceC4180h2 interfaceC4180h2, ServiceConnection serviceConnection) {
        this.f24285h = serviceConnectionC4606n4;
        this.f24283f = interfaceC4180h2;
        this.f24284g = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleMo9820V;
        long j2;
        String string;
        ServiceConnectionC4606n4 serviceConnectionC4606n4 = this.f24285h;
        C4618o4 c4618o4 = serviceConnectionC4606n4.f24176b;
        String str = serviceConnectionC4606n4.f24175a;
        InterfaceC4180h2 interfaceC4180h2 = this.f24283f;
        ServiceConnection serviceConnection = this.f24284g;
        c4618o4.f24227a.mo10686n().mo10381b();
        if (interfaceC4180h2 != null) {
            try {
                bundleMo9820V = interfaceC4180h2.mo9820V(outline.m1575Z("package_name", str));
                if (bundleMo9820V == null) {
                    c4618o4.f24227a.mo10684l().f24418f.m10811a("Install Referrer Service returned a null response");
                }
            } catch (Exception e) {
                c4618o4.f24227a.mo10684l().f24418f.m10812b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            }
            c4618o4.f24227a.mo10686n().mo10381b();
            if (bundleMo9820V != null) {
                j2 = bundleMo9820V.getLong("install_begin_timestamp_seconds", 0L) * 1000;
                if (j2 == 0) {
                    c4618o4.f24227a.mo10684l().f24421i.m10811a("Service response is missing Install Referrer install timestamp");
                } else {
                    string = bundleMo9820V.getString("install_referrer");
                    if (string != null || string.isEmpty()) {
                        c4618o4.f24227a.mo10684l().f24418f.m10811a("No referrer defined in Install Referrer response");
                    } else {
                        c4618o4.f24227a.mo10684l().f24426n.m10812b("InstallReferrer API result", string);
                        Bundle bundleM10906x = c4618o4.f24227a.m10837t().m10906x(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                        if (bundleM10906x == null) {
                            c4618o4.f24227a.mo10684l().f24418f.m10811a("No campaign params defined in Install Referrer result");
                        } else {
                            String string2 = bundleM10906x.getString("medium");
                            if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                                long j3 = bundleMo9820V.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j3 == 0) {
                                    c4618o4.f24227a.mo10684l().f24418f.m10811a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    bundleM10906x.putLong("click_timestamp", j3);
                                    if (j2 == c4618o4.f24227a.m10834k().f23897l.m10610a()) {
                                        c4618o4.f24227a.mo10684l().f24426n.m10811a("Install Referrer campaign has already been logged");
                                    } else if (((InterfaceC4369u9) C4327r9.f23436f.zza()).zza() || !c4618o4.f24227a.f24534h.m10417k(C4647r.f24376t0) || c4618o4.f24227a.m10828d()) {
                                        c4618o4.f24227a.m10834k().f23897l.m10611b(j2);
                                        c4618o4.f24227a.mo10684l().f24426n.m10812b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                        bundleM10906x.putString("_cis", "referrer API");
                                        c4618o4.f24227a.m10836s().m10517H("auto", "_cmp", bundleM10906x);
                                    }
                                }
                            } else if (j2 == c4618o4.f24227a.m10834k().f23897l.m10610a()) {
                                c4618o4.f24227a.mo10684l().f24426n.m10811a("Install Referrer campaign has already been logged");
                            } else if (((InterfaceC4369u9) C4327r9.f23436f.zza()).zza()) {
                                c4618o4.f24227a.m10834k().f23897l.m10611b(j2);
                                c4618o4.f24227a.mo10684l().f24426n.m10812b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                bundleM10906x.putString("_cis", "referrer API");
                                c4618o4.f24227a.m10836s().m10517H("auto", "_cmp", bundleM10906x);
                            } else {
                                c4618o4.f24227a.m10834k().f23897l.m10611b(j2);
                                c4618o4.f24227a.mo10684l().f24426n.m10812b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                bundleM10906x.putString("_cis", "referrer API");
                                c4618o4.f24227a.m10836s().m10517H("auto", "_cmp", bundleM10906x);
                            }
                        }
                    }
                }
            }
            if (serviceConnection != null) {
                C2778a.m5615b().m5617c(c4618o4.f24227a.f24528b, serviceConnection);
            }
        }
        c4618o4.f24227a.mo10684l().f24421i.m10811a("Attempting to use Install Referrer Service while it is not initialized");
        bundleMo9820V = null;
        c4618o4.f24227a.mo10686n().mo10381b();
        if (bundleMo9820V != null) {
            j2 = bundleMo9820V.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                c4618o4.f24227a.mo10684l().f24421i.m10811a("Service response is missing Install Referrer install timestamp");
            } else {
                string = bundleMo9820V.getString("install_referrer");
                if (string != null) {
                    c4618o4.f24227a.mo10684l().f24418f.m10811a("No referrer defined in Install Referrer response");
                } else {
                    c4618o4.f24227a.mo10684l().f24418f.m10811a("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            C2778a.m5615b().m5617c(c4618o4.f24227a.f24528b, serviceConnection);
        }
    }
}
