package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.k.rc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4330rc extends C4079a implements InterfaceC4302pc {
    public C4330rc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void beginAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeLong(j2);
        m9334T1(23, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10298c(parcelM9333E0, bundle);
        m9334T1(9, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void endAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeLong(j2);
        m9334T1(24, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void generateEventId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(22, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getCachedAppInstanceId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(19, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getConditionalUserProperties(String str, String str2, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(10, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getCurrentScreenClass(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(17, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getCurrentScreenName(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(16, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getGmpAppId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(21, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getMaxUserProperties(String str, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(6, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        ClassLoader classLoader = C4385w.f23577a;
        parcelM9333E0.writeInt(z ? 1 : 0);
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        m9334T1(5, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void initialize(InterfaceC2799a interfaceC2799a, C4149f c4149f, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        C4385w.m10298c(parcelM9333E0, c4149f);
        parcelM9333E0.writeLong(j2);
        m9334T1(1, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10298c(parcelM9333E0, bundle);
        parcelM9333E0.writeInt(z ? 1 : 0);
        parcelM9333E0.writeInt(z2 ? 1 : 0);
        parcelM9333E0.writeLong(j2);
        m9334T1(2, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void logHealthData(int i, String str, InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeInt(i);
        parcelM9333E0.writeString(str);
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        C4385w.m10297b(parcelM9333E0, interfaceC2799a2);
        C4385w.m10297b(parcelM9333E0, interfaceC2799a3);
        m9334T1(33, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityCreated(InterfaceC2799a interfaceC2799a, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        C4385w.m10298c(parcelM9333E0, bundle);
        parcelM9333E0.writeLong(j2);
        m9334T1(27, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityDestroyed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeLong(j2);
        m9334T1(28, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityPaused(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeLong(j2);
        m9334T1(29, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityResumed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeLong(j2);
        m9334T1(30, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivitySaveInstanceState(InterfaceC2799a interfaceC2799a, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        parcelM9333E0.writeLong(j2);
        m9334T1(31, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityStarted(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeLong(j2);
        m9334T1(25, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void onActivityStopped(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeLong(j2);
        m9334T1(26, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void performAction(Bundle bundle, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, bundle);
        C4385w.m10297b(parcelM9333E0, interfaceC4316qc);
        parcelM9333E0.writeLong(j2);
        m9334T1(32, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void registerOnMeasurementEventListener(InterfaceC4107c interfaceC4107c) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC4107c);
        m9334T1(35, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, bundle);
        parcelM9333E0.writeLong(j2);
        m9334T1(8, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void setConsent(Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, bundle);
        parcelM9333E0.writeLong(j2);
        m9334T1(44, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void setCurrentScreen(InterfaceC2799a interfaceC2799a, String str, String str2, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        parcelM9333E0.writeLong(j2);
        m9334T1(15, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        ClassLoader classLoader = C4385w.f23577a;
        parcelM9333E0.writeInt(z ? 1 : 0);
        m9334T1(39, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public final void setUserProperty(String str, String str2, InterfaceC2799a interfaceC2799a, boolean z, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10297b(parcelM9333E0, interfaceC2799a);
        parcelM9333E0.writeInt(z ? 1 : 0);
        parcelM9333E0.writeLong(j2);
        m9334T1(4, parcelM9333E0);
    }
}
