package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.k.pc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4302pc extends IInterface {
    void beginAdUnitExposure(String str, long j2) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j2) throws RemoteException;

    void endAdUnitExposure(String str, long j2) throws RemoteException;

    void generateEventId(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getAppInstanceId(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getCurrentScreenClass(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getCurrentScreenName(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getGmpAppId(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void getTestFlag(InterfaceC4316qc interfaceC4316qc, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC2799a interfaceC2799a, C4149f c4149f, long j2) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC4316qc interfaceC4316qc) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException;

    void logHealthData(int i, String str, InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) throws RemoteException;

    void onActivityCreated(InterfaceC2799a interfaceC2799a, Bundle bundle, long j2) throws RemoteException;

    void onActivityDestroyed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException;

    void onActivityPaused(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException;

    void onActivityResumed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC2799a interfaceC2799a, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException;

    void onActivityStarted(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException;

    void onActivityStopped(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC4107c interfaceC4107c) throws RemoteException;

    void resetAnalyticsData(long j2) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException;

    void setConsent(Bundle bundle, long j2) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException;

    void setCurrentScreen(InterfaceC2799a interfaceC2799a, String str, String str2, long j2) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC4107c interfaceC4107c) throws RemoteException;

    void setInstanceIdProvider(InterfaceC4121d interfaceC4121d) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j2) throws RemoteException;

    void setMinimumSessionDuration(long j2) throws RemoteException;

    void setSessionTimeoutDuration(long j2) throws RemoteException;

    void setUserId(String str, long j2) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC2799a interfaceC2799a, boolean z, long j2) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC4107c interfaceC4107c) throws RemoteException;
}
