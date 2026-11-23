package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final SensorManager f18071a;

    /* JADX INFO: renamed from: b */
    public final Sensor f18072b;

    /* JADX INFO: renamed from: c */
    public float f18073c = 0.0f;

    /* JADX INFO: renamed from: d */
    public Float f18074d = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: e */
    public long f18075e = C2330u.f10884a.f10896k.mo5623c();

    /* JADX INFO: renamed from: f */
    public int f18076f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f18077g = false;

    /* JADX INFO: renamed from: h */
    public boolean f18078h = false;

    /* JADX INFO: renamed from: i */
    public oq0 f18079i = null;

    /* JADX INFO: renamed from: j */
    public boolean f18080j = false;

    public pq0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f18071a = sensorManager;
        if (sensorManager != null) {
            this.f18072b = sensorManager.getDefaultSensor(4);
        } else {
            this.f18072b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8148a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14463v5)).booleanValue()) {
                if (!this.f18080j && (sensorManager = this.f18071a) != null && (sensor = this.f18072b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f18080j = true;
                    C2096e.m4590z("Listening for flick gestures.");
                }
                if (this.f18071a == null || this.f18072b == null) {
                    C2622l.m5226A3("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14463v5;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
            if (this.f18075e + ((long) ((Integer) c2862b.f12496d.m6596a(C3052g3.f14477x5)).intValue()) < jMo5623c) {
                this.f18076f = 0;
                this.f18075e = jMo5623c;
                this.f18077g = false;
                this.f18078h = false;
                this.f18073c = this.f18074d.floatValue();
            }
            Float fValueOf = Float.valueOf((sensorEvent.values[1] * 4.0f) + this.f18074d.floatValue());
            this.f18074d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.f18073c;
            AbstractC3718y2<Float> abstractC3718y3 = C3052g3.f14470w5;
            if (fFloatValue > ((Float) c2862b.f12496d.m6596a(abstractC3718y3)).floatValue() + f) {
                this.f18073c = this.f18074d.floatValue();
                this.f18078h = true;
            } else if (this.f18074d.floatValue() < this.f18073c - ((Float) c2862b.f12496d.m6596a(abstractC3718y3)).floatValue()) {
                this.f18073c = this.f18074d.floatValue();
                this.f18077g = true;
            }
            if (this.f18074d.isInfinite()) {
                this.f18074d = Float.valueOf(0.0f);
                this.f18073c = 0.0f;
            }
            if (this.f18077g && this.f18078h) {
                C2096e.m4590z("Flick detected.");
                this.f18075e = jMo5623c;
                int i = this.f18076f + 1;
                this.f18076f = i;
                this.f18077g = false;
                this.f18078h = false;
                oq0 oq0Var = this.f18079i;
                if (oq0Var != null) {
                    if (i == ((Integer) c2862b.f12496d.m6596a(C3052g3.f14484y5)).intValue()) {
                        ((br0) oq0Var).m6074c(new ar0());
                    }
                }
            }
        }
    }
}
