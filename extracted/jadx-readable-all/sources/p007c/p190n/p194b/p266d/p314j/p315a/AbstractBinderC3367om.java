package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.BinderC2161s;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.C2141a;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.C2159q;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.C2160r;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.cs1;
import p007c.p190n.p194b.p266d.p314j.p315a.cw0;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.sd2;
import p007c.p190n.p194b.p266d.p314j.p315a.tb2;

/* JADX INFO: renamed from: c.n.b.d.j.a.om */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3367om extends hg2 implements InterfaceC3404pm {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f17676f = 0;

    public AbstractBinderC3367om() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        kv1 kv1VarM6249s;
        String str = "";
        InterfaceC3293mm c3219km = null;
        switch (i) {
            case 1:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                C3552tm c3552tm = (C3552tm) ig2.m7250a(parcel, C3552tm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c3219km = iInterfaceQueryLocalInterface instanceof InterfaceC3293mm ? (InterfaceC3293mm) iInterfaceQueryLocalInterface : new C3219km(strongBinder);
                }
                ((BinderC2161s) this).mo4622x4(interfaceC2799aM5638i1, c3552tm, c3219km);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                BinderC2161s binderC2161s = (BinderC2161s) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14462v4)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) BinderC2800b.m5639T1(interfaceC2799aM5638i2);
                    C3510sh c3510sh = binderC2161s.f10529r;
                    binderC2161s.f10530s = C2096e.m4561J(motionEvent, c3510sh != null ? c3510sh.f19555f : null);
                    if (motionEvent.getAction() == 0) {
                        binderC2161s.f10531t = binderC2161s.f10530s;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC2161s.f10530s;
                    motionEventObtain.setLocation(point.x, point.y);
                    binderC2161s.f10524m.f18750d.mo4852a(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 4:
                InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 5:
                final ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                final InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                InterfaceC3362oh interfaceC3362ohM7862F6 = AbstractBinderC3325nh.m7862F6(parcel.readStrongBinder());
                final BinderC2161s binderC2161s2 = (BinderC2161s) this;
                if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14462v4)).booleanValue()) {
                    try {
                        interfaceC3362ohM7862F6.mo7698S("The updating URL feature is not enabled.");
                    } catch (RemoteException e) {
                        C2622l.m5438t3("", e);
                    }
                    break;
                } else {
                    kv1 kv1VarMo6691u0 = binderC2161s2.f10527p.mo6691u0(new Callable(binderC2161s2, arrayListCreateTypedArrayList, interfaceC2799aM5638i3) { // from class: c.n.b.d.a.d0.a.f

                        /* JADX INFO: renamed from: a */
                        public final BinderC2161s f10497a;

                        /* JADX INFO: renamed from: b */
                        public final List f10498b;

                        /* JADX INFO: renamed from: c */
                        public final InterfaceC2799a f10499c;

                        {
                            this.f10497a = binderC2161s2;
                            this.f10498b = arrayListCreateTypedArrayList;
                            this.f10499c = interfaceC2799aM5638i3;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Exception {
                            BinderC2161s binderC2161s3 = this.f10497a;
                            List<Uri> list = this.f10498b;
                            InterfaceC2799a interfaceC2799a = this.f10499c;
                            tb2 tb2Var = binderC2161s3.f10524m.f18750d;
                            String strMo4853b = tb2Var != null ? tb2Var.mo4853b(binderC2161s3.f10523l, (View) BinderC2800b.m5639T1(interfaceC2799a), null) : "";
                            if (TextUtils.isEmpty(strMo4853b)) {
                                throw new Exception("Failed to get view signals.");
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Uri uri : list) {
                                if (BinderC2161s.m4618F6(uri, BinderC2161s.f10520i, BinderC2161s.f10521j)) {
                                    arrayList.add(BinderC2161s.m4619H6(uri, "ms", strMo4853b));
                                } else {
                                    String strValueOf = String.valueOf(uri);
                                    StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                                    sb.append("Not a Google URL: ");
                                    sb.append(strValueOf);
                                    C2622l.m5226A3(sb.toString());
                                    arrayList.add(uri);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                throw new Exception("Empty impression URLs result.");
                            }
                            return arrayList;
                        }
                    });
                    if (binderC2161s2.m4621r()) {
                        kv1VarMo6691u0 = cw0.m6249s(kv1VarMo6691u0, new qu1(binderC2161s2) { // from class: c.n.b.d.a.d0.a.g

                            /* JADX INFO: renamed from: a */
                            public final BinderC2161s f10500a;

                            {
                                this.f10500a = binderC2161s2;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj) {
                                final BinderC2161s binderC2161s3 = this.f10500a;
                                final ArrayList arrayList = (ArrayList) obj;
                                return cw0.m6250t(binderC2161s3.m4620G6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new cs1(binderC2161s3, arrayList) { // from class: c.n.b.d.a.d0.a.j

                                    /* JADX INFO: renamed from: a */
                                    public final List f10505a;

                                    {
                                        this.f10505a = arrayList;
                                    }

                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                                    public final Object apply(Object obj2) {
                                        List<Uri> list = this.f10505a;
                                        String str2 = (String) obj2;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Uri uri : list) {
                                            if (!BinderC2161s.m4618F6(uri, BinderC2161s.f10520i, BinderC2161s.f10521j) || TextUtils.isEmpty(str2)) {
                                                arrayList2.add(uri);
                                            } else {
                                                arrayList2.add(BinderC2161s.m4619H6(uri, "nas", str2));
                                            }
                                        }
                                        return arrayList2;
                                    }
                                }, binderC2161s3.f10527p);
                            }
                        }, binderC2161s2.f10527p);
                    } else {
                        C2622l.m5458x3("Asset view map is empty.");
                    }
                    kv1VarMo6691u0.mo6230f(new ev1(kv1VarMo6691u0, new C2159q(interfaceC3362ohM7862F6)), binderC2161s2.f10522k.mo7624f());
                }
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                final InterfaceC2799a interfaceC2799aM5638i4 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                InterfaceC3362oh interfaceC3362ohM7862F7 = AbstractBinderC3325nh.m7862F6(parcel.readStrongBinder());
                final BinderC2161s binderC2161s3 = (BinderC2161s) this;
                try {
                    if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14462v4)).booleanValue()) {
                        interfaceC3362ohM7862F7.mo7698S("The updating URL feature is not enabled.");
                        str = str;
                    } else if (arrayListCreateTypedArrayList2.size() != 1) {
                        interfaceC3362ohM7862F7.mo7698S("There should be only 1 click URL.");
                        str = str;
                    } else {
                        final Uri uri = (Uri) arrayListCreateTypedArrayList2.get(0);
                        if (BinderC2161s.m4618F6(uri, BinderC2161s.f10518g, BinderC2161s.f10519h)) {
                            kv1 kv1VarMo6691u1 = binderC2161s3.f10527p.mo6691u0(new Callable(binderC2161s3, uri, interfaceC2799aM5638i4) { // from class: c.n.b.d.a.d0.a.h

                                /* JADX INFO: renamed from: a */
                                public final BinderC2161s f10501a;

                                /* JADX INFO: renamed from: b */
                                public final Uri f10502b;

                                /* JADX INFO: renamed from: c */
                                public final InterfaceC2799a f10503c;

                                {
                                    this.f10501a = binderC2161s3;
                                    this.f10502b = uri;
                                    this.f10503c = interfaceC2799aM5638i4;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() throws Exception {
                                    BinderC2161s binderC2161s4 = this.f10501a;
                                    Uri uriM8272b = this.f10502b;
                                    InterfaceC2799a interfaceC2799a = this.f10503c;
                                    Objects.requireNonNull(binderC2161s4);
                                    try {
                                        uriM8272b = binderC2161s4.f10524m.m8272b(uriM8272b, binderC2161s4.f10523l, (View) BinderC2800b.m5639T1(interfaceC2799a), null);
                                    } catch (sd2 e2) {
                                        C2622l.m5241D3("", e2);
                                    }
                                    if (uriM8272b.getQueryParameter("ms") != null) {
                                        return uriM8272b;
                                    }
                                    throw new Exception("Failed to append spam signals to click url.");
                                }
                            });
                            if (binderC2161s3.m4621r()) {
                                kv1VarM6249s = cw0.m6249s(kv1VarMo6691u1, new qu1(binderC2161s3) { // from class: c.n.b.d.a.d0.a.i

                                    /* JADX INFO: renamed from: a */
                                    public final BinderC2161s f10504a;

                                    {
                                        this.f10504a = binderC2161s3;
                                    }

                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                                    /* JADX INFO: renamed from: a */
                                    public final kv1 mo4612a(Object obj) {
                                        final BinderC2161s binderC2161s4 = this.f10504a;
                                        final Uri uri2 = (Uri) obj;
                                        return cw0.m6250t(binderC2161s4.m4620G6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new cs1(binderC2161s4, uri2) { // from class: c.n.b.d.a.d0.a.k

                                            /* JADX INFO: renamed from: a */
                                            public final Uri f10506a;

                                            {
                                                this.f10506a = uri2;
                                            }

                                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                                            public final Object apply(Object obj2) {
                                                Uri uri3 = this.f10506a;
                                                String str2 = (String) obj2;
                                                return !TextUtils.isEmpty(str2) ? BinderC2161s.m4619H6(uri3, "nas", str2) : uri3;
                                            }
                                        }, binderC2161s4.f10527p);
                                    }
                                }, binderC2161s3.f10527p);
                            } else {
                                C2622l.m5458x3("Asset view map is empty.");
                                kv1VarM6249s = kv1VarMo6691u1;
                            }
                            C2160r c2160r = new C2160r(interfaceC3362ohM7862F7);
                            Executor executorMo7624f = binderC2161s3.f10522k.mo7624f();
                            ev1 ev1Var = new ev1(kv1VarM6249s, c2160r);
                            kv1VarM6249s.mo6230f(ev1Var, executorMo7624f);
                            str = ev1Var;
                        } else {
                            String strValueOf = String.valueOf(uri);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                            sb.append("Not a Google URL: ");
                            sb.append(strValueOf);
                            C2622l.m5226A3(sb.toString());
                            interfaceC3362ohM7862F7.mo7699y5(arrayListCreateTypedArrayList2);
                            str = str;
                        }
                    }
                    break;
                } catch (RemoteException e2) {
                    C2622l.m5438t3(str, e2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                C3510sh c3510sh2 = (C3510sh) ig2.m7250a(parcel, C3510sh.CREATOR);
                BinderC2161s binderC2161s4 = (BinderC2161s) this;
                binderC2161s4.f10529r = c3510sh2;
                binderC2161s4.f10526o.m8651a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC2799a interfaceC2799aM5638i5 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                BinderC2161s binderC2161s5 = (BinderC2161s) this;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14162B5)).booleanValue()) {
                    WebView webView = (WebView) BinderC2800b.m5639T1(interfaceC2799aM5638i5);
                    if (webView == null) {
                        C2622l.m5408n3("The webView cannot be null.");
                    } else if (binderC2161s5.f10532u.contains(webView)) {
                        C2622l.m5458x3("This webview has already been registered.");
                    } else {
                        binderC2161s5.f10532u.add(webView);
                        webView.addJavascriptInterface(new C2141a(webView), "gmaSdk");
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
