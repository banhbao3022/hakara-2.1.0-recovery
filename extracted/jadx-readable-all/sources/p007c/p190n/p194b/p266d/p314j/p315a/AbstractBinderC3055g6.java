package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.g6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3055g6 extends hg2 implements InterfaceC3129i6 {
    public AbstractBinderC3055g6() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        SimpleArrayMap<String, String> simpleArrayMap;
        SimpleArrayMap<String, BinderC3091h5> simpleArrayMap2;
        SimpleArrayMap<String, BinderC3091h5> simpleArrayMap3;
        SimpleArrayMap<String, String> simpleArrayMap4;
        wf0 wf0Var;
        int i3 = 0;
        switch (i) {
            case 1:
                String string = parcel.readString();
                bg0 bg0Var = ((dk0) this).f13290g;
                synchronized (bg0Var) {
                    simpleArrayMap = bg0Var.f12619s;
                }
                String orDefault = simpleArrayMap.getOrDefault(string, null);
                parcel2.writeNoException();
                parcel2.writeString(orDefault);
                return true;
            case 2:
                String string2 = parcel.readString();
                bg0 bg0Var2 = ((dk0) this).f13290g;
                synchronized (bg0Var2) {
                    simpleArrayMap2 = bg0Var2.f12618r;
                }
                BinderC3091h5 orDefault2 = simpleArrayMap2.getOrDefault(string2, null);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, orDefault2);
                return true;
            case 3:
                dk0 dk0Var = (dk0) this;
                bg0 bg0Var3 = dk0Var.f13290g;
                synchronized (bg0Var3) {
                    simpleArrayMap3 = bg0Var3.f12618r;
                }
                bg0 bg0Var4 = dk0Var.f13290g;
                synchronized (bg0Var4) {
                    simpleArrayMap4 = bg0Var4.f12619s;
                }
                String[] strArr = new String[simpleArrayMap3.f36667l + simpleArrayMap4.f36667l];
                int i4 = 0;
                int i5 = 0;
                while (i4 < simpleArrayMap3.f36667l) {
                    strArr[i5] = simpleArrayMap3.m15611h(i4);
                    i4++;
                    i5++;
                }
                while (i3 < simpleArrayMap4.f36667l) {
                    strArr[i5] = simpleArrayMap4.m15611h(i3);
                    i3++;
                    i5++;
                }
                List<String> listAsList = Arrays.asList(strArr);
                parcel2.writeNoException();
                parcel2.writeStringList(listAsList);
                return true;
            case 4:
                String strM6002h = ((dk0) this).f13290g.m6002h();
                parcel2.writeNoException();
                parcel2.writeString(strM6002h);
                return true;
            case 5:
                ((dk0) this).m6363F6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                ((dk0) this).m6367h();
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3087h1 interfaceC3087h1M6009s = ((dk0) this).f13290g.m6009s();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1M6009s);
                return true;
            case 8:
                dk0 dk0Var2 = (dk0) this;
                wf0 wf0Var2 = dk0Var2.f13292i;
                if (wf0Var2 != null) {
                    wf0Var2.mo7041b();
                }
                dk0Var2.f13292i = null;
                dk0Var2.f13291h = null;
                parcel2.writeNoException();
                return true;
            case 9:
                BinderC2800b binderC2800b = new BinderC2800b(((dk0) this).f13289f);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 10:
                boolean zMo6365H = ((dk0) this).mo6365H(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zMo6365H ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 12:
                dk0 dk0Var3 = (dk0) this;
                wf0 wf0Var3 = dk0Var3.f13292i;
                if ((wf0Var3 == null || wf0Var3.f21055m.mo6999c()) && dk0Var3.f13290g.m6004j() != null && dk0Var3.f13290g.m6003i() == null) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                dk0 dk0Var4 = (dk0) this;
                InterfaceC2799a interfaceC2799aM6005k = dk0Var4.f13290g.m6005k();
                if (interfaceC2799aM6005k != null) {
                    C2330u.f10884a.f10908w.mo5880k0(interfaceC2799aM6005k);
                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14295X2)).booleanValue() && dk0Var4.f13290g.m6004j() != null) {
                        dk0Var4.f13290g.m6004j().mo6501r0("onSdkLoaded", new ArrayMap());
                    }
                    i3 = 1;
                } else {
                    C2622l.m5226A3("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = ig2.f15182a;
                parcel2.writeInt(i3);
                return true;
            case 14:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                dk0 dk0Var5 = (dk0) this;
                Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799aM5638i1);
                if ((objM5639T1 instanceof View) && dk0Var5.f13290g.m6005k() != null && (wf0Var = dk0Var5.f13292i) != null) {
                    wf0Var.m8630d((View) objM5639T1);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                ((dk0) this).m6364G6();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
