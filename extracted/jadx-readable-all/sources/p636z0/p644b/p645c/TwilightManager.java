package p636z0.p644b.p645c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* JADX INFO: renamed from: z0.b.c.u, reason: use source file name */
/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes.dex */
public class TwilightManager {

    /* JADX INFO: renamed from: a */
    public static TwilightManager f34548a;

    /* JADX INFO: renamed from: b */
    public final Context f34549b;

    /* JADX INFO: renamed from: c */
    public final LocationManager f34550c;

    /* JADX INFO: renamed from: d */
    public final a f34551d = new a();

    /* JADX INFO: renamed from: z0.b.c.u$a */
    /* JADX INFO: compiled from: TwilightManager.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f34552a;

        /* JADX INFO: renamed from: b */
        public long f34553b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.f34549b = context;
        this.f34550c = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public final Location m14686a(String str) {
        try {
            if (this.f34550c.isProviderEnabled(str)) {
                return this.f34550c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
