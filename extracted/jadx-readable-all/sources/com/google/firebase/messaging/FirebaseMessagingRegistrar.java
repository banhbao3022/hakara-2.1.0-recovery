package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.Event;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p195a.Transport;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p195a.TransportScheduleCallback;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p391l.p392e.p405r.DataTransportCrashlyticsReportSender;
import p007c.p190n.p385d.p416p.Subscriber;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p428w.C5548m;
import p007c.p190n.p385d.p428w.C5549n;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static class C5998b<T> implements Transport<T> {
        public C5998b(C5997a c5997a) {
        }

        @Override // p007c.p190n.p194b.p195a.Transport
        /* JADX INFO: renamed from: a */
        public void mo2748a(Event<T> event) {
        }

        @Override // p007c.p190n.p194b.p195a.Transport
        /* JADX INFO: renamed from: b */
        public void mo2749b(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
            ((DataTransportCrashlyticsReportSender) transportScheduleCallback).mo2751a(null);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$c */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static class C5999c implements TransportFactory {
        @Override // p007c.p190n.p194b.p195a.TransportFactory
        /* JADX INFO: renamed from: a */
        public <T> Transport<T> mo2750a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
            return new C5998b(null);
        }
    }

    public static TransportFactory determineFactory(TransportFactory transportFactory) {
        if (transportFactory == null) {
            return new C5999c();
        }
        try {
            transportFactory.mo2750a("test", String.class, new Encoding("json"), C5549n.f27279a);
            return transportFactory;
        } catch (IllegalArgumentException unused) {
            return new C5999c();
        }
    }

    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp2) componentContainer.mo11684a(FirebaseApp2.class), (FirebaseInstanceId) componentContainer.mo11684a(FirebaseInstanceId.class), componentContainer.mo11693b(UserAgentPublisher.class), componentContainer.mo11693b(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.mo11684a(FirebaseInstallationsApi.class), determineFactory((TransportFactory) componentContainer.mo11684a(TransportFactory.class)), (Subscriber) componentContainer.mo11684a(Subscriber.class));
    }

    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    @Keep
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(FirebaseMessaging.class);
        bVarM11686a.m11689a(new Dependency(FirebaseApp2.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(FirebaseInstanceId.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(UserAgentPublisher.class, 0, 1));
        bVarM11686a.m11689a(new Dependency(HeartBeatInfo.class, 0, 1));
        bVarM11686a.m11689a(new Dependency(TransportFactory.class, 0, 0));
        bVarM11686a.m11689a(new Dependency(FirebaseInstallationsApi.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(Subscriber.class, 1, 0));
        bVarM11686a.m11691c(C5548m.f27278a);
        bVarM11686a.m11692d(1);
        return Arrays.asList(bVarM11686a.m11690b(), C4799a.m11010r("fire-fcm", "20.1.7_1p"));
    }
}
