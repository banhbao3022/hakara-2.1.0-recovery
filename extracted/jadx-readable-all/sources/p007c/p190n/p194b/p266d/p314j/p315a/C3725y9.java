package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.InterfaceC2769c;

/* JADX INFO: renamed from: c.n.b.d.j.a.y9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3725y9 implements ps2 {

    /* JADX INFO: renamed from: a */
    public volatile C3243l9 f21813a;

    /* JADX INFO: renamed from: b */
    public final Context f21814b;

    public C3725y9(Context context) {
        this.f21814b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ps2
    /* JADX INFO: renamed from: a */
    public final lv2 mo4798a(AbstractC3679x0<?> abstractC3679x0) throws C2872b9 {
        InterfaceC2769c interfaceC2769c;
        Parcelable.Creator<C3280m9> creator = C3280m9.CREATOR;
        Map<String, String> mapMo4829q = abstractC3679x0.mo4829q();
        int size = mapMo4829q.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry<String, String> entry : mapMo4829q.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        C3280m9 c3280m9 = new C3280m9(abstractC3679x0.f21405h, strArr, strArr2);
        C2330u c2330u = C2330u.f10884a;
        long jMo5621a = c2330u.f10896k.mo5621a();
        try {
            C3147io c3147io = new C3147io();
            this.f21813a = new C3243l9(this.f21814b, c2330u.f10903r.m4786a(), new C3651w9(this, c3147io), new C3688x9(c3147io));
            this.f21813a.m5578o();
            C3576u9 c3576u9 = new C3576u9(c3280m9);
            lv1 lv1Var = C2962do.f13330a;
            kv1 kv1VarM6248r = cw0.m6248r(cw0.m6249s(c3147io, c3576u9, lv1Var), ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14418p2)).intValue(), TimeUnit.MILLISECONDS, C2962do.f13333d);
            kv1VarM6248r.mo6230f(new RunnableC3614v9(this), lv1Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) kv1VarM6248r.get();
            long jMo5621a2 = c2330u.f10896k.mo5621a();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(jMo5621a2 - jMo5621a);
            sb.append("ms");
            C2096e.m4590z(sb.toString());
            C3363oi c3363oi = new C3363oi(parcelFileDescriptor);
            Parcelable.Creator<C3354o9> creator2 = C3354o9.CREATOR;
            if (c3363oi.f17628h) {
                ParcelFileDescriptor parcelFileDescriptor2 = c3363oi.f17626f;
                if (parcelFileDescriptor2 == null) {
                    C2622l.m5408n3("File descriptor is empty, returning null.");
                } else {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor2));
                    try {
                        try {
                            int i3 = dataInputStream.readInt();
                            byte[] bArr = new byte[i3];
                            dataInputStream.readFully(bArr, 0, i3);
                            try {
                                dataInputStream.close();
                            } catch (IOException unused) {
                            }
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.unmarshall(bArr, 0, i3);
                                parcelObtain.setDataPosition(0);
                                c3363oi.f17627g = creator2.createFromParcel(parcelObtain);
                                parcelObtain.recycle();
                                c3363oi.f17628h = false;
                                interfaceC2769c = (InterfaceC2769c) c3363oi.f17627g;
                            } catch (Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused2) {
                            }
                            throw th2;
                        }
                    } catch (IOException e) {
                        C2622l.m5438t3("Could not read from parcel file descriptor", e);
                        try {
                            dataInputStream.close();
                        } catch (IOException unused3) {
                        }
                        interfaceC2769c = null;
                    }
                }
                interfaceC2769c = null;
            } else {
                interfaceC2769c = (InterfaceC2769c) c3363oi.f17627g;
            }
            C3354o9 c3354o9 = (C3354o9) interfaceC2769c;
            if (c3354o9 == null) {
                return null;
            }
            if (c3354o9.f17556f) {
                throw new C2872b9(c3354o9.f17557g);
            }
            if (c3354o9.f17560j.length != c3354o9.f17561k.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = c3354o9.f17560j;
                if (i >= strArr3.length) {
                    return new lv2(c3354o9.f17558h, c3354o9.f17559i, map, c3354o9.f17562l, c3354o9.f17563m);
                }
                map.put(strArr3[i], c3354o9.f17561k[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused4) {
            long jMo5621a3 = C2330u.f10884a.f10896k.mo5621a();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(jMo5621a3 - jMo5621a);
            sb2.append("ms");
            C2096e.m4590z(sb2.toString());
            return null;
        } catch (Throwable th3) {
            long jMo5621a4 = C2330u.f10884a.f10896k.mo5621a();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(jMo5621a4 - jMo5621a);
            sb3.append("ms");
            C2096e.m4590z(sb3.toString());
            throw th3;
        }
    }
}
