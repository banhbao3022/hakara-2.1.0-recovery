package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: c.n.b.d.j.a.up */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3592up implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final SensorManager f20388a;

    /* JADX INFO: renamed from: c */
    public final Display f20390c;

    /* JADX INFO: renamed from: f */
    public float[] f20393f;

    /* JADX INFO: renamed from: g */
    public Handler f20394g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3555tp f20395h;

    /* JADX INFO: renamed from: d */
    public final float[] f20391d = new float[9];

    /* JADX INFO: renamed from: e */
    public final float[] f20392e = new float[9];

    /* JADX INFO: renamed from: b */
    public final Object f20389b = new Object();

    public C3592up(Context context) {
        this.f20388a = (SensorManager) context.getSystemService("sensor");
        this.f20390c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX INFO: renamed from: a */
    public final void m8515a() {
        if (this.f20394g == null) {
            return;
        }
        this.f20388a.unregisterListener(this);
        this.f20394g.post(new RunnableC3518sp());
        this.f20394g = null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8516b(float[] fArr) {
        synchronized (this.f20389b) {
            float[] fArr2 = this.f20393f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f20389b) {
            if (this.f20393f == null) {
                this.f20393f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f20391d, fArr);
        int rotation = this.f20390c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f20391d, 2, 129, this.f20392e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f20391d, 129, 130, this.f20392e);
        } else if (rotation != 3) {
            System.arraycopy(this.f20391d, 0, this.f20392e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f20391d, 130, 1, this.f20392e);
        }
        float[] fArr2 = this.f20392e;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.f20389b) {
            System.arraycopy(this.f20392e, 0, this.f20393f, 0, 9);
        }
        InterfaceC3555tp interfaceC3555tp = this.f20395h;
        if (interfaceC3555tp != null) {
            C3630vp c3630vp = (C3630vp) interfaceC3555tp;
            synchronized (c3630vp.f20872A) {
                c3630vp.f20872A.notifyAll();
            }
        }
    }
}
