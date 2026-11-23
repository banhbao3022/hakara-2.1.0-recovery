package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4149f;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p327k.p329b.C4500e6;
import p007c.p190n.p194b.p266d.p327k.p329b.C4585l7;
import p007c.p190n.p194b.p266d.p327k.p329b.C4588la;
import p007c.p190n.p194b.p266d.p327k.p329b.C4707w4;
import p007c.p190n.p194b.p266d.p327k.p329b.C4712w9;
import p007c.p190n.p194b.p266d.p327k.p329b.C4723x9;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4643q6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4676t6;
import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: a */
    public static volatile AppMeasurement f28692a;

    /* JADX INFO: renamed from: b */
    public final C4707w4 f28693b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4489d7 f28694c;

    /* JADX INFO: renamed from: d */
    public final boolean f28695d;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m12674a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C4340s8.m10214k(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Throwable th;
            ObjectInputStream objectInputStream;
            ObjectOutputStream objectOutputStream;
            Objects.requireNonNull(conditionalUserProperty, "null reference");
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object obj2 = null;
                try {
                    if (obj != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                objectOutputStream.writeObject(obj);
                                objectOutputStream.flush();
                                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                try {
                                    Object object = objectInputStream.readObject();
                                    objectOutputStream.close();
                                    objectInputStream.close();
                                    obj2 = object;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (objectOutputStream != null) {
                                        objectOutputStream.close();
                                    }
                                    if (objectInputStream == null) {
                                        throw th;
                                    }
                                    objectInputStream.close();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectInputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            objectInputStream = null;
                            objectOutputStream = null;
                        }
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                this.mValue = obj2;
                if (obj2 == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }

        public ConditionalUserProperty(Bundle bundle) {
            Objects.requireNonNull(bundle, "null reference");
            this.mAppId = (String) C4340s8.m10210g(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C4340s8.m10210g(bundle, "origin", String.class, null);
            this.mName = (String) C4340s8.m10210g(bundle, "name", String.class, null);
            this.mValue = C4340s8.m10210g(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C4340s8.m10210g(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C4340s8.m10210g(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C4340s8.m10210g(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C4340s8.m10210g(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C4340s8.m10210g(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C4340s8.m10210g(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C4340s8.m10210g(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C4340s8.m10210g(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C4340s8.m10210g(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C4340s8.m10210g(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C4340s8.m10210g(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C4340s8.m10210g(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C4707w4 c4707w4) {
        Objects.requireNonNull(c4707w4, "null reference");
        this.f28693b = c4707w4;
        this.f28694c = null;
        this.f28695d = false;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        InterfaceC4489d7 interfaceC4489d7;
        if (f28692a == null) {
            synchronized (AppMeasurement.class) {
                if (f28692a == null) {
                    try {
                        interfaceC4489d7 = (InterfaceC4489d7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        interfaceC4489d7 = null;
                    }
                    if (interfaceC4489d7 != null) {
                        f28692a = new AppMeasurement(interfaceC4489d7);
                    } else {
                        f28692a = new AppMeasurement(C4707w4.m10821b(context, new C4149f(0L, 0L, true, null, null, null, null), null));
                    }
                }
            }
        }
        return f28692a;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f28695d) {
            this.f28694c.mo10502f(str);
        } else {
            this.f28693b.m10825A().m10374v(str, this.f28693b.f24541o.mo5621a());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f28695d) {
            this.f28694c.mo10504h(str, str2, bundle);
        } else {
            this.f28693b.m10836s().m10527R(str, str2, bundle);
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f28695d) {
            this.f28694c.mo10506t(str);
        } else {
            this.f28693b.m10825A().m10377y(str, this.f28693b.f24541o.mo5621a());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f28695d ? this.f28694c.mo10499c() : this.f28693b.m10837t().m10902t0();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f28695d ? this.f28694c.mo10498b() : this.f28693b.m10836s().f23855g.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listM10861j0;
        if (this.f28695d) {
            listM10861j0 = this.f28694c.mo10500d(str, str2);
        } else {
            C4500e6 c4500e6M10836s = this.f28693b.m10836s();
            if (c4500e6M10836s.mo10686n().m10761y()) {
                c4500e6M10836s.mo10684l().f24418f.m10811a("Cannot get conditional user properties from analytics worker thread");
                listM10861j0 = new ArrayList<>(0);
            } else if (C4588la.m10646a()) {
                c4500e6M10836s.mo10684l().f24418f.m10811a("Cannot get conditional user properties from main thread");
                listM10861j0 = new ArrayList<>(0);
            } else {
                AtomicReference atomicReference = new AtomicReference();
                c4500e6M10836s.f24476a.mo10686n().m10755s(atomicReference, 5000L, "get conditional user properties", new RunnableC4643q6(c4500e6M10836s, atomicReference, str, str2));
                List list = (List) atomicReference.get();
                if (list == null) {
                    c4500e6M10836s.mo10684l().f24418f.m10812b("Timed out waiting for get conditional user properties", null);
                    listM10861j0 = new ArrayList<>();
                } else {
                    listM10861j0 = C4723x9.m10861j0(list);
                }
            }
        }
        ArrayList arrayList = new ArrayList(listM10861j0 != null ? listM10861j0.size() : 0);
        Iterator<Bundle> it = listM10861j0.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.f28695d) {
            return this.f28694c.mo10497a();
        }
        C4585l7 c4585l7 = this.f28693b.m10836s().f24476a.m10840w().f24065c;
        if (c4585l7 != null) {
            return c4585l7.f24122b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.f28695d) {
            return this.f28694c.zza();
        }
        C4585l7 c4585l7 = this.f28693b.m10836s().f24476a.m10840w().f24065c;
        if (c4585l7 != null) {
            return c4585l7.f24121a;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        return this.f28695d ? this.f28694c.mo10501e() : this.f28693b.m10836s().m10524O();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f28695d) {
            return this.f28694c.mo10495E(str);
        }
        this.f28693b.m10836s();
        C2622l.m5359e(str);
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f28695d) {
            return this.f28694c.mo10503g(str, str2, z);
        }
        C4500e6 c4500e6M10836s = this.f28693b.m10836s();
        if (c4500e6M10836s.mo10686n().m10761y()) {
            c4500e6M10836s.mo10684l().f24418f.m10811a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C4588la.m10646a()) {
            c4500e6M10836s.mo10684l().f24418f.m10811a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        c4500e6M10836s.f24476a.mo10686n().m10755s(atomicReference, 5000L, "get user properties", new RunnableC4676t6(c4500e6M10836s, atomicReference, str, str2, z));
        List<C4712w9> list = (List) atomicReference.get();
        if (list == null) {
            c4500e6M10836s.mo10684l().f24418f.m10812b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (C4712w9 c4712w9 : list) {
            arrayMap.put(c4712w9.f24562g, c4712w9.m10847H());
        }
        return arrayMap;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f28695d) {
            this.f28694c.mo10505i(str, str2, bundle);
        } else {
            this.f28693b.m10836s().m10517H(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Objects.requireNonNull(conditionalUserProperty, "null reference");
        if (this.f28695d) {
            this.f28694c.mo10496V(conditionalUserProperty.m12674a());
        } else {
            C4500e6 c4500e6M10836s = this.f28693b.m10836s();
            c4500e6M10836s.m10530y(conditionalUserProperty.m12674a(), c4500e6M10836s.f24476a.f24541o.mo5623c());
        }
    }

    public AppMeasurement(InterfaceC4489d7 interfaceC4489d7) {
        this.f28694c = interfaceC4489d7;
        this.f28693b = null;
        this.f28695d = true;
    }
}
