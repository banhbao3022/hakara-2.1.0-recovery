package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.k.oc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4288oc extends BinderC4373v0 implements InterfaceC4302pc {
    public AbstractBinderC4288oc() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC4302pc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4302pc ? (InterfaceC4302pc) iInterfaceQueryLocalInterface : new C4330rc(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.BinderC4373v0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo9388E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC4316qc c4344sc = null;
        InterfaceC4316qc c4344sc2 = null;
        InterfaceC4316qc c4344sc3 = null;
        InterfaceC4107c c4135e = null;
        InterfaceC4107c c4135e2 = null;
        InterfaceC4107c c4135e3 = null;
        InterfaceC4316qc c4344sc4 = null;
        InterfaceC4316qc c4344sc5 = null;
        InterfaceC4316qc c4344sc6 = null;
        InterfaceC4316qc c4344sc7 = null;
        InterfaceC4316qc c4344sc8 = null;
        InterfaceC4316qc c4344sc9 = null;
        InterfaceC4121d c4163g = null;
        InterfaceC4316qc c4344sc10 = null;
        InterfaceC4316qc c4344sc11 = null;
        InterfaceC4316qc c4344sc12 = null;
        InterfaceC4316qc c4344sc13 = null;
        InterfaceC4316qc c4344sc14 = null;
        switch (i) {
            case 1:
                initialize(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (C4149f) C4385w.m10296a(parcel, C4149f.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc = iInterfaceQueryLocalInterface instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface : new C4344sc(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, c4344sc, parcel.readLong());
                break;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ClassLoader classLoader = C4385w.f23577a;
                setUserProperty(string3, string4, interfaceC2799aM5638i1, parcel.readInt() != 0, parcel.readLong());
                break;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader2 = C4385w.f23577a;
                boolean z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc14 = iInterfaceQueryLocalInterface2 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface2 : new C4344sc(strongBinder2);
                }
                getUserProperties(string5, string6, z, c4344sc14);
                break;
            case 6:
                String string7 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc13 = iInterfaceQueryLocalInterface3 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface3 : new C4344sc(strongBinder3);
                }
                getMaxUserProperties(string7, c4344sc13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc12 = iInterfaceQueryLocalInterface4 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface4 : new C4344sc(strongBinder4);
                }
                getConditionalUserProperties(string8, string9, c4344sc12);
                break;
            case 11:
                ClassLoader classLoader3 = C4385w.f23577a;
                setMeasurementEnabled(parcel.readInt() != 0, parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc11 = iInterfaceQueryLocalInterface5 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface5 : new C4344sc(strongBinder5);
                }
                getCurrentScreenName(c4344sc11);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc10 = iInterfaceQueryLocalInterface6 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface6 : new C4344sc(strongBinder6);
                }
                getCurrentScreenClass(c4344sc10);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c4163g = iInterfaceQueryLocalInterface7 instanceof InterfaceC4121d ? (InterfaceC4121d) iInterfaceQueryLocalInterface7 : new C4163g(strongBinder7);
                }
                setInstanceIdProvider(c4163g);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc9 = iInterfaceQueryLocalInterface8 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface8 : new C4344sc(strongBinder8);
                }
                getCachedAppInstanceId(c4344sc9);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc8 = iInterfaceQueryLocalInterface9 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface9 : new C4344sc(strongBinder9);
                }
                getAppInstanceId(c4344sc8);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc7 = iInterfaceQueryLocalInterface10 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface10 : new C4344sc(strongBinder10);
                }
                getGmpAppId(c4344sc7);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc6 = iInterfaceQueryLocalInterface11 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface11 : new C4344sc(strongBinder11);
                }
                generateEventId(c4344sc6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc5 = iInterfaceQueryLocalInterface12 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface12 : new C4344sc(strongBinder12);
                }
                onActivitySaveInstanceState(interfaceC2799aM5638i2, c4344sc5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) C4385w.m10296a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc4 = iInterfaceQueryLocalInterface13 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface13 : new C4344sc(strongBinder13);
                }
                performAction(bundle2, c4344sc4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c4135e3 = iInterfaceQueryLocalInterface14 instanceof InterfaceC4107c ? (InterfaceC4107c) iInterfaceQueryLocalInterface14 : new C4135e(strongBinder14);
                }
                setEventInterceptor(c4135e3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c4135e2 = iInterfaceQueryLocalInterface15 instanceof InterfaceC4107c ? (InterfaceC4107c) iInterfaceQueryLocalInterface15 : new C4135e(strongBinder15);
                }
                registerOnMeasurementEventListener(c4135e2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c4135e = iInterfaceQueryLocalInterface16 instanceof InterfaceC4107c ? (InterfaceC4107c) iInterfaceQueryLocalInterface16 : new C4135e(strongBinder16);
                }
                unregisterOnMeasurementEventListener(c4135e);
                break;
            case 37:
                initForTests(parcel.readHashMap(C4385w.f23577a));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc3 = iInterfaceQueryLocalInterface17 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface17 : new C4344sc(strongBinder17);
                }
                getTestFlag(c4344sc3, parcel.readInt());
                break;
            case 39:
                ClassLoader classLoader4 = C4385w.f23577a;
                setDataCollectionEnabled(parcel.readInt() != 0);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4344sc2 = iInterfaceQueryLocalInterface18 instanceof InterfaceC4316qc ? (InterfaceC4316qc) iInterfaceQueryLocalInterface18 : new C4344sc(strongBinder18);
                }
                isDataCollectionEnabled(c4344sc2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
