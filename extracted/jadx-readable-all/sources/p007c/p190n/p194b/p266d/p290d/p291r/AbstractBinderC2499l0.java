package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3843d4;
import p007c.p190n.p194b.p266d.p314j.p320f.C4008u0;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;
import p007c.p190n.p194b.p266d.p314j.p320f.C4019v2;
import p007c.p190n.p194b.p266d.p314j.p320f.C4030w4;
import p007c.p190n.p194b.p266d.p314j.p320f.C4032w6;
import p007c.p190n.p194b.p266d.p314j.p320f.C4055z2;
import p007c.p190n.p194b.p266d.p314j.p320f.EnumC3860f1;
import p007c.p190n.p194b.p266d.p314j.p320f.EnumC3929m0;

/* JADX INFO: renamed from: c.n.b.d.d.r.l0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2499l0 extends BinderC3808a implements InterfaceC2441j0 {
    public AbstractBinderC2499l0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        EnumC3929m0 enumC3929m0;
        switch (i) {
            case 1:
                BinderC2800b binderC2800b = new BinderC2800b(((BinderC2505q) this).f11363f);
                parcel2.writeNoException();
                C4016v.m9268b(parcel2, binderC2800b);
                return true;
            case 2:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                BinderC2505q binderC2505q = (BinderC2505q) this;
                AbstractC2436h abstractC2436h = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i1);
                if (binderC2505q.f11364g.isInstance(abstractC2436h) && (obj = binderC2505q.f11363f) != null) {
                    C4030w4 c4030w4 = (C4030w4) obj;
                    C2426c c2426c = (C2426c) ((AbstractC2436h) binderC2505q.f11364g.cast(abstractC2436h));
                    if (c4030w4.f22969a.f22888f != null) {
                        C2518b c2518b = C4008u0.f22883a;
                        Log.w(c2518b.f11373a, c2518b.m5123e("Start a session while there's already an active session. Create a new one.", new Object[0]));
                    }
                    c4030w4.f22969a.m9228e(c2426c);
                    c4030w4.f22969a.f22884b.m9038a(C4032w6.m9292a(c4030w4.f22969a.f22888f), EnumC3860f1.APP_SESSION_STARTING);
                }
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                String string = parcel.readString();
                BinderC2505q binderC2505q2 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h2 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i2);
                if (binderC2505q2.f11364g.isInstance(abstractC2436h2) && (obj2 = binderC2505q2.f11363f) != null) {
                    C4030w4 c4030w5 = (C4030w4) obj2;
                    c4030w5.f22969a.m9229f((C2426c) ((AbstractC2436h) binderC2505q2.f11364g.cast(abstractC2436h2)));
                    C3843d4 c3843d4 = c4030w5.f22969a.f22888f;
                    c3843d4.f22563g = string;
                    c4030w5.f22969a.f22884b.m9038a(C4032w6.m9292a(c3843d4), EnumC3860f1.APP_SESSION_RUNNING);
                    C4008u0.m9226d(c4030w5.f22969a);
                    C4008u0 c4008u0 = c4030w5.f22969a;
                    c4008u0.f22886d.postDelayed(c4008u0.f22885c, 300000L);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                BinderC2505q binderC2505q3 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h3 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i3);
                if (binderC2505q3.f11364g.isInstance(abstractC2436h3) && (obj3 = binderC2505q3.f11363f) != null) {
                    C4008u0.m9225b(((C4030w4) obj3).f22969a, (C2426c) ((AbstractC2436h) binderC2505q3.f11364g.cast(abstractC2436h3)), i3);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC2799a interfaceC2799aM5638i4 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                BinderC2505q binderC2505q4 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h4 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i4);
                if (binderC2505q4.f11364g.isInstance(abstractC2436h4) && (obj4 = binderC2505q4.f11363f) != null) {
                }
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC2799a interfaceC2799aM5638i5 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                BinderC2505q binderC2505q5 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h5 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i5);
                if (binderC2505q5.f11364g.isInstance(abstractC2436h5) && (obj5 = binderC2505q5.f11363f) != null) {
                    C4008u0.m9225b(((C4030w4) obj5).f22969a, (C2426c) ((AbstractC2436h) binderC2505q5.f11364g.cast(abstractC2436h5)), i4);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2799a interfaceC2799aM5638i6 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                BinderC2505q binderC2505q6 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h6 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i6);
                if (binderC2505q6.f11364g.isInstance(abstractC2436h6) && (obj6 = binderC2505q6.f11363f) != null) {
                    C4030w4 c4030w6 = (C4030w4) obj6;
                    C4008u0 c4008u1 = c4030w6.f22969a;
                    SharedPreferences sharedPreferences = c4008u1.f22887e;
                    if (c4008u1.m9230g(string2)) {
                        C4008u0.f22883a.m5119a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
                    } else {
                        C2518b c2518b2 = C3843d4.f22557a;
                        C3843d4 c3843d5 = null;
                        if (sharedPreferences != null) {
                            C3843d4 c3843d6 = new C3843d4();
                            if (sharedPreferences.contains("application_id")) {
                                c3843d6.f22559c = sharedPreferences.getString("application_id", "");
                                if (sharedPreferences.contains("receiver_metrics_id")) {
                                    c3843d6.f22560d = sharedPreferences.getString("receiver_metrics_id", "");
                                    if (sharedPreferences.contains("analytics_session_id")) {
                                        c3843d6.f22561e = sharedPreferences.getLong("analytics_session_id", 0L);
                                        if (sharedPreferences.contains("event_sequence_number")) {
                                            c3843d6.f22562f = sharedPreferences.getInt("event_sequence_number", 0);
                                            if (sharedPreferences.contains("receiver_session_id")) {
                                                c3843d6.f22563g = sharedPreferences.getString("receiver_session_id", "");
                                                c3843d5 = c3843d6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c4008u1.f22888f = c3843d5;
                        if (c4008u1.m9230g(string2)) {
                            C4008u0.f22883a.m5119a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                            C3843d4.f22558b = c4008u1.f22888f.f22561e + 1;
                        } else {
                            C4008u0.f22883a.m5119a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                            C3843d4 c3843d7 = new C3843d4();
                            C3843d4.f22558b++;
                            c4008u1.f22888f = c3843d7;
                            c3843d7.f22559c = C4008u0.m9224a();
                            c4008u1.f22888f.f22563g = string2;
                        }
                    }
                    C4055z2.a aVarM9294c = C4032w6.m9294c(c4030w6.f22969a.f22888f);
                    C4032w6.m9293b(aVarM9294c, true);
                    C4019v2.a aVarM9271n = C4019v2.m9271n(aVarM9294c.m9316r());
                    aVarM9271n.m9280q(EnumC3929m0.APP_SESSION_RESUMED_FROM_SAVED_SESSION);
                    aVarM9294c.m9315q(aVarM9271n);
                    c4030w6.f22969a.f22884b.m9038a((C4055z2) ((AbstractC4057z4) aVarM9294c.m9326p()), EnumC3860f1.APP_SESSION_RESUMING);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC2799a interfaceC2799aM5638i7 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                int i5 = C4016v.f22903a;
                boolean z = parcel.readInt() != 0;
                BinderC2505q binderC2505q7 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h7 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i7);
                if (binderC2505q7.f11364g.isInstance(abstractC2436h7) && (obj7 = binderC2505q7.f11363f) != null) {
                    C4030w4 c4030w7 = (C4030w4) obj7;
                    c4030w7.f22969a.m9229f((C2426c) ((AbstractC2436h) binderC2505q7.f11364g.cast(abstractC2436h7)));
                    C4055z2.a aVarM9294c2 = C4032w6.m9294c(c4030w7.f22969a.f22888f);
                    C4032w6.m9293b(aVarM9294c2, z);
                    c4030w7.f22969a.f22884b.m9038a((C4055z2) ((AbstractC4057z4) aVarM9294c2.m9326p()), EnumC3860f1.APP_SESSION_RESUMED);
                    C4008u0.m9226d(c4030w7.f22969a);
                    C4008u0 c4008u2 = c4030w7.f22969a;
                    c4008u2.f22886d.postDelayed(c4008u2.f22885c, 300000L);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC2799a interfaceC2799aM5638i8 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                BinderC2505q binderC2505q8 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h8 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i8);
                if (binderC2505q8.f11364g.isInstance(abstractC2436h8) && (obj8 = binderC2505q8.f11363f) != null) {
                    C4008u0.m9225b(((C4030w4) obj8).f22969a, (C2426c) ((AbstractC2436h) binderC2505q8.f11364g.cast(abstractC2436h8)), i6);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC2799a interfaceC2799aM5638i9 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                BinderC2505q binderC2505q9 = (BinderC2505q) this;
                AbstractC2436h abstractC2436h9 = (AbstractC2436h) BinderC2800b.m5639T1(interfaceC2799aM5638i9);
                if (binderC2505q9.f11364g.isInstance(abstractC2436h9) && (obj9 = binderC2505q9.f11363f) != null) {
                    C4030w4 c4030w8 = (C4030w4) obj9;
                    c4030w8.f22969a.m9229f((C2426c) ((AbstractC2436h) binderC2505q9.f11364g.cast(abstractC2436h9)));
                    C4055z2.a aVarM9294c3 = C4032w6.m9294c(c4030w8.f22969a.f22888f);
                    C4019v2.a aVarM9271n2 = C4019v2.m9271n(aVarM9294c3.m9316r());
                    if (i7 != 1) {
                        enumC3929m0 = i7 != 2 ? EnumC3929m0.APP_SESSION_REASON_UNKNOWN : EnumC3929m0.APP_SESSION_NETWORK_NOT_REACHABLE;
                    } else {
                        enumC3929m0 = EnumC3929m0.APP_SESSION_GMSCORE_SERVICE_DISCONNECTED;
                    }
                    aVarM9271n2.m9280q(enumC3929m0);
                    aVarM9294c3.m9315q(aVarM9271n2);
                    c4030w8.f22969a.f22884b.m9038a((C4055z2) ((AbstractC4057z4) aVarM9294c3.m9326p()), EnumC3860f1.APP_SESSION_SUSPENDED);
                    C4008u0.m9226d(c4030w8.f22969a);
                    C4008u0 c4008u3 = c4030w8.f22969a;
                    c4008u3.f22886d.removeCallbacks(c4008u3.f22885c);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            default:
                return false;
        }
    }
}
