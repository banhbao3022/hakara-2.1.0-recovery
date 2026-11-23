package com.devbrackets.android.playlistcore.components.mediasession;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import java.util.Objects;
import p007c.p008a.p009a.p029b.p031b.p035d.DefaultMediaSessionProvider;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: DefaultMediaSessionControlsReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultMediaSessionControlsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f28241a;

    /* JADX INFO: renamed from: com.devbrackets.android.playlistcore.components.mediasession.DefaultMediaSessionControlsReceiver$a */
    /* JADX INFO: compiled from: DefaultMediaSessionControlsReceiver.kt */
    public static final class C5798a {
        public C5798a() {
        }

        public C5798a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new C5798a(null);
        f28241a = "DefaultControlsReceiver";
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent m12578a(Context context, String str, Class<? extends Service> cls) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(str, "action");
        Intrinsics2.m13090f(cls, "serviceClass");
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(context, 0, intent, 134217728);
        Intrinsics2.m13086b(service, "PendingIntent.getService…tent.FLAG_UPDATE_CURRENT)");
        return service;
    }

    /* JADX INFO: renamed from: b */
    public void m12579b(PendingIntent pendingIntent) {
        Intrinsics2.m13090f(pendingIntent, "pi");
        try {
            pendingIntent.send();
        } catch (Exception e) {
            Log.d(f28241a, "Error sending media controls pending intent", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(intent, "intent");
        if (Intrinsics2.m13085a("android.intent.action.MEDIA_BUTTON", intent.getAction())) {
            Intrinsics2.m13090f(context, "context");
            Intrinsics2.m13090f(intent, "intent");
            Objects.requireNonNull(DefaultMediaSessionProvider.f1692i);
            String str = DefaultMediaSessionProvider.f1691h;
            Intrinsics2.m13090f(intent, "intent");
            Intrinsics2.m13090f(str, "key");
            String stringExtra = intent.getStringExtra(str);
            Class<?> cls = null;
            if (stringExtra != null) {
                try {
                    cls = Class.forName(stringExtra);
                } catch (Exception e) {
                    Log.e(f28241a, "Unable to determine service from extras", e);
                }
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (cls == null || keyEvent == null || keyEvent.getAction() != 1) {
                return;
            }
            Intrinsics2.m13090f(context, "context");
            Intrinsics2.m13090f(cls, "mediaServiceClass");
            Intrinsics2.m13090f(keyEvent, "keyEvent");
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 85) {
                RemoteActions remoteActions = RemoteActions.f1769j;
                m12579b(m12578a(context, RemoteActions.f1761b, cls));
            } else if (keyCode == 87) {
                RemoteActions remoteActions2 = RemoteActions.f1769j;
                m12579b(m12578a(context, RemoteActions.f1763d, cls));
            } else {
                if (keyCode != 88) {
                    return;
                }
                RemoteActions remoteActions3 = RemoteActions.f1769j;
                m12579b(m12578a(context, RemoteActions.f1762c, cls));
            }
        }
    }
}
