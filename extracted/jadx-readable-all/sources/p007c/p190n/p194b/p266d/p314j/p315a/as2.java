package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Environment;
import android.os.RemoteException;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class as2 {

    /* JADX INFO: renamed from: a */
    public final ds2 f12263a;

    /* JADX INFO: renamed from: b */
    public final mt2 f12264b;

    /* JADX INFO: renamed from: c */
    public final boolean f12265c;

    public as2() {
        this.f12264b = ot2.m8064z();
        this.f12265c = false;
        this.f12263a = new ds2();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5845a(bs2 bs2Var) {
        if (this.f12265c) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14229M2)).booleanValue()) {
                m5848d(bs2Var);
            } else {
                m5847c(bs2Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5846b(zr2 zr2Var) {
        if (this.f12265c) {
            try {
                zr2Var.mo6684a(this.f12264b);
            } catch (NullPointerException e) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5847c(bs2 bs2Var) {
        mt2 mt2Var = this.f12264b;
        if (mt2Var.f13191h) {
            mt2Var.m6298m();
            mt2Var.f13191h = false;
        }
        ot2.m8058D((ot2) mt2Var.f13190g);
        List<String> listM6924c = C3052g3.m6924c();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listM6924c).iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    C2096e.m4590z("Experiment ID is not a number");
                }
            }
        }
        if (mt2Var.f13191h) {
            mt2Var.m6298m();
            mt2Var.f13191h = false;
        }
        ot2.m8057C((ot2) mt2Var.f13190g, arrayList);
        ds2 ds2Var = this.f12263a;
        byte[] bArrMo7574w = this.f12264b.m6300o().mo7574w();
        int i = bs2Var.f12857c0;
        try {
            if (ds2Var.f13377b) {
                ds2Var.f13376a.mo7343s4(bArrMo7574w);
                ds2Var.f13376a.mo7344x0(0);
                ds2Var.f13376a.mo7339A0(i);
                ds2Var.f13376a.mo7340G3(null);
                ds2Var.f13376a.mo7342d();
            }
        } catch (RemoteException e) {
            C2622l.m5358d3("Clearcut log failed", e);
        }
        String strValueOf = String.valueOf(Integer.toString(bs2Var.f12857c0, 10));
        C2096e.m4590z(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5848d(bs2 bs2Var) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m5849e(bs2Var).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C2096e.m4590z("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C2096e.m4590z("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C2096e.m4590z("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    C2096e.m4590z("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            C2096e.m4590z("Could not find file for Clearcut");
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m5849e(bs2 bs2Var) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((ot2) this.f12264b.f13190g).m8065v(), Long.valueOf(C2330u.f10884a.f10896k.mo5621a()), Integer.valueOf(bs2Var.f12857c0), Base64.encodeToString(this.f12264b.m6300o().mo7574w(), 3));
    }

    public as2(ds2 ds2Var) {
        this.f12264b = ot2.m8064z();
        this.f12263a = ds2Var;
        this.f12265c = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14223L2)).booleanValue();
    }
}
