package p007c.p165l.p178k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: renamed from: c.l.k0.c, reason: use source file name */
/* JADX INFO: compiled from: BoltsMeasurementEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static BoltsMeasurementEventListener f4896a;

    /* JADX INFO: renamed from: b */
    public Context f4897b;

    public BoltsMeasurementEventListener(Context context) {
        this.f4897b = context.getApplicationContext();
    }

    public void finalize() throws Throwable {
        try {
            LocalBroadcastManager.m16762a(this.f4897b).m16765d(this);
        } finally {
            super.finalize();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        StringBuilder sbM1556G = outline.m1556G("bf_");
        sbM1556G.append(intent.getStringExtra("event_name"));
        String string = sbM1556G.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str));
        }
        internalAppEventsLogger.m2369b(string, bundle);
    }
}
