package p007c.p165l.p166h0.p168c0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.UserSettingsManager;
import p007c.p165l.p178k0.FetchedAppSettings;

/* JADX INFO: renamed from: c.l.h0.c0.o, reason: use source file name */
/* JADX INFO: compiled from: ViewIndexingTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewIndexingTrigger implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public a f4665a;

    /* JADX INFO: renamed from: c.l.h0.c0.o$a */
    /* JADX INFO: compiled from: ViewIndexingTrigger.java */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f4665a != null) {
            float[] fArr = sensorEvent.values;
            boolean z = false;
            double d = fArr[0] / 9.80665f;
            double d2 = fArr[1] / 9.80665f;
            double d3 = fArr[2] / 9.80665f;
            if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.299999952316284d) {
                CodelessManager codelessManager = (CodelessManager) this.f4665a;
                FetchedAppSettings fetchedAppSettings = codelessManager.f4622a;
                if (fetchedAppSettings != null && fetchedAppSettings.f5008h) {
                    z = true;
                }
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                UserSettingsManager.m2269b();
                boolean zM2275a = UserSettingsManager.f4578g.m2275a();
                if (z && zM2275a) {
                    String str = codelessManager.f4623b;
                    if (CodelessManager3.f4631g.booleanValue()) {
                        return;
                    }
                    CodelessManager3.f4631g = Boolean.TRUE;
                    FacebookSdk.m2660b().execute(new CodelessManager2(str));
                }
            }
        }
    }
}
