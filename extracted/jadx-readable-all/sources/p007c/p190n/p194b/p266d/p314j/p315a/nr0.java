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
public final class nr0 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final Context f17249a;

    /* JADX INFO: renamed from: b */
    public SensorManager f17250b;

    /* JADX INFO: renamed from: c */
    public Sensor f17251c;

    /* JADX INFO: renamed from: d */
    public long f17252d;

    /* JADX INFO: renamed from: e */
    public int f17253e;

    /* JADX INFO: renamed from: f */
    public mr0 f17254f;

    /* JADX INFO: renamed from: g */
    public boolean f17255g;

    public nr0(Context context) {
        this.f17249a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m7931a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14428q5;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                    if (this.f17250b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f17249a.getSystemService("sensor");
                        this.f17250b = sensorManager2;
                        if (sensorManager2 == null) {
                            C2622l.m5226A3("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f17251c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f17255g && (sensorManager = this.f17250b) != null && (sensor = this.f17251c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f17252d = C2330u.f10884a.f10896k.mo5623c() - ((long) ((Integer) c2862b.f12496d.m6596a(C3052g3.f14442s5)).intValue());
                        this.f17255g = true;
                        C2096e.m4590z("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14428q5;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) < ((Float) c2862b.f12496d.m6596a(C3052g3.f14435r5)).floatValue()) {
                return;
            }
            long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
            if (this.f17252d + ((long) ((Integer) c2862b.f12496d.m6596a(C3052g3.f14442s5)).intValue()) > jMo5623c) {
                return;
            }
            if (this.f17252d + ((long) ((Integer) c2862b.f12496d.m6596a(C3052g3.f14449t5)).intValue()) < jMo5623c) {
                this.f17253e = 0;
            }
            C2096e.m4590z("Shake detected.");
            this.f17252d = jMo5623c;
            int i = this.f17253e + 1;
            this.f17253e = i;
            mr0 mr0Var = this.f17254f;
            if (mr0Var != null) {
                if (i == ((Integer) c2862b.f12496d.m6596a(C3052g3.f14456u5)).intValue()) {
                    ((br0) mr0Var).m6074c(new zq0());
                }
            }
        }
    }
}
