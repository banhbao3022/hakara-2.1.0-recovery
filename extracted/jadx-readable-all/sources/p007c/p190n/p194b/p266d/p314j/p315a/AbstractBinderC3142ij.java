package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ij */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3142ij extends hg2 implements IInterface {
    public AbstractBinderC3142ij() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0220 A[Catch: all -> 0x025a, TryCatch #3 {, blocks: (B:97:0x01ef, B:101:0x0207, B:105:0x020f, B:106:0x0220, B:108:0x0226, B:112:0x023a), top: B:125:0x01ef, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0226 A[Catch: all -> 0x025a, TRY_LEAVE, TryCatch #3 {, blocks: (B:97:0x01ef, B:101:0x0207, B:105:0x020f, B:106:0x0220, B:108:0x0226, B:112:0x023a), top: B:125:0x01ef, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0238 A[DONT_GENERATE] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        a60 a60Var;
        InterfaceC3715y c3678x;
        InterfaceC3216kj c3179jj = null;
        C3105hj c3105hj = null;
        str = null;
        String str = null;
        if (i == 1) {
            C3253lj c3253lj = (C3253lj) ig2.m7250a(parcel, C3253lj.CREATOR);
            oh1 oh1Var = (oh1) this;
            synchronized (oh1Var) {
                C2622l.m5354d("loadAd must be called on the main UI thread.");
                String str2 = c3253lj.f16371g;
                String str3 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14335d3);
                if (str3 == null || str2 == null) {
                    if (oh1Var.m8016N()) {
                        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14349f3)).booleanValue()) {
                        }
                    }
                    yg1 yg1Var = new yg1(null);
                    oh1Var.f17621i = null;
                    gh1 gh1Var = oh1Var.f17618f;
                    gh1Var.f14586g.f14869o.f21546a = 1;
                    gh1Var.mo6607b(c3253lj.f16370f, c3253lj.f16371g, yg1Var, new mh1(oh1Var));
                } else {
                    try {
                        if (!Pattern.matches(str3, str2)) {
                            if (oh1Var.m8016N()) {
                                if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14349f3)).booleanValue()) {
                                }
                            }
                            yg1 yg1Var2 = new yg1(null);
                            oh1Var.f17621i = null;
                            gh1 gh1Var2 = oh1Var.f17618f;
                            gh1Var2.f14586g.f14869o.f21546a = 1;
                            gh1Var2.mo6607b(c3253lj.f16370f, c3253lj.f16371g, yg1Var2, new mh1(oh1Var));
                        }
                    } catch (RuntimeException e) {
                        C2998en c2998en = C2330u.f10884a.f10893h;
                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "NonagonUtil.isPatternMatched");
                    }
                }
            }
            parcel2.writeNoException();
        } else if (i == 2) {
            oh1 oh1Var2 = (oh1) this;
            synchronized (oh1Var2) {
                oh1Var2.m8012H6(null);
            }
            parcel2.writeNoException();
        } else if (i != 3) {
            i = 0;
            int i3 = 0;
            if (i != 34) {
                switch (i) {
                    case 5:
                        C2622l.m5354d("isLoaded must be called on the main UI thread.");
                        boolean zM8016N = ((oh1) this).m8016N();
                        parcel2.writeNoException();
                        ClassLoader classLoader = ig2.f15182a;
                        parcel2.writeInt(zM8016N ? 1 : 0);
                        break;
                    case 6:
                        ((oh1) this).m8017R(null);
                        parcel2.writeNoException();
                        break;
                    case 7:
                        ((oh1) this).m8015M4(null);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        ((oh1) this).m8010F6(null);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        ((oh1) this).m8017R(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        ((oh1) this).m8015M4(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        ((oh1) this).m8010F6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        oh1 oh1Var3 = (oh1) this;
                        synchronized (oh1Var3) {
                            dl0 dl0Var = oh1Var3.f17621i;
                            if (dl0Var != null && (a60Var = dl0Var.f16669f) != null) {
                                str = a60Var.f12023f;
                            }
                            break;
                        }
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        break;
                    case 13:
                        String string = parcel.readString();
                        oh1 oh1Var4 = (oh1) this;
                        synchronized (oh1Var4) {
                            C2622l.m5354d("setUserId must be called on the main UI thread.");
                            oh1Var4.f17620h.f13588a = string;
                        }
                        parcel2.writeNoException();
                        break;
                    case 14:
                        IBinder strongBinder = parcel.readStrongBinder();
                        if (strongBinder == null) {
                            c3678x = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                            c3678x = iInterfaceQueryLocalInterface instanceof InterfaceC3715y ? (InterfaceC3715y) iInterfaceQueryLocalInterface : new C3678x(strongBinder);
                        }
                        oh1 oh1Var5 = (oh1) this;
                        C2622l.m5354d("setAdMetadataListener can only be called from the UI thread.");
                        if (c3678x == null) {
                            oh1Var5.f17619g.f21096g.set(null);
                        } else {
                            oh1Var5.f17619g.f21096g.set(new nh1(oh1Var5, c3678x));
                        }
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleM8011G6 = ((oh1) this).m8011G6();
                        parcel2.writeNoException();
                        ig2.m7252c(parcel2, bundleM8011G6);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c3105hj = iInterfaceQueryLocalInterface2 instanceof C3105hj ? (C3105hj) iInterfaceQueryLocalInterface2 : new C3105hj(strongBinder2);
                        }
                        C2622l.m5354d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                        ((oh1) this).f17619g.f21101l.set(c3105hj);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case 18:
                        ((oh1) this).m8012H6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        ((oh1) this).m8013I6(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        dl0 dl0Var2 = ((oh1) this).f17621i;
                        if (dl0Var2 != null) {
                            InterfaceC3410ps interfaceC3410ps = dl0Var2.f13306j.get();
                            if ((interfaceC3410ps == null || interfaceC3410ps.mo6494n0()) ? false : true) {
                                i3 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        ClassLoader classLoader2 = ig2.f15182a;
                        parcel2.writeInt(i3);
                        break;
                    case 21:
                        InterfaceC2976e1 interfaceC2976e1M8018o = ((oh1) this).m8018o();
                        parcel2.writeNoException();
                        ig2.m7253d(parcel2, interfaceC2976e1M8018o);
                        break;
                    default:
                        return false;
                }
            } else {
                ClassLoader classLoader3 = ig2.f15182a;
                ((oh1) this).m8014J6(parcel.readInt() != 0);
                parcel2.writeNoException();
            }
        } else {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                c3179jj = iInterfaceQueryLocalInterface3 instanceof InterfaceC3216kj ? (InterfaceC3216kj) iInterfaceQueryLocalInterface3 : new C3179jj(strongBinder3);
            }
            C2622l.m5354d("setRewardedVideoAdListener can only be called from the UI thread.");
            ((oh1) this).f17619g.f21099j.set(c3179jj);
            parcel2.writeNoException();
        }
        return true;
    }
}
