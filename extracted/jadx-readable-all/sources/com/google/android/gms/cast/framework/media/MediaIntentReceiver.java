package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2407m;
import p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h;
import p007c.p190n.p194b.p266d.p290d.p291r.C2422a;
import p007c.p190n.p194b.p266d.p290d.p291r.C2426c;
import p007c.p190n.p194b.p266d.p290d.p291r.C2438i;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2481l;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2483m;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2489q;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static void zza(C2426c c2426c, long j2) {
        C2458h c2458hZzi;
        if (j2 == 0 || (c2458hZzi = zzi(c2426c)) == null || c2458hZzi.m5069j() || c2458hZzi.m5073n()) {
            return;
        }
        long jM5061b = c2458hZzi.m5061b() + j2;
        C2407m.a aVar = new C2407m.a();
        aVar.f11088a = jM5061b;
        aVar.f11089b = 0;
        aVar.f11090c = null;
        C2407m c2407m = new C2407m(jM5061b, 0, false, null, null);
        C2622l.m5354d("Must be called from the main thread.");
        if (c2458hZzi.m5079v()) {
            C2458h.m5059p(new C2489q(c2458hZzi, c2407m));
        } else {
            C2458h.m5060q(17, null);
        }
    }

    private static void zzh(C2426c c2426c) {
        C2458h c2458hZzi = zzi(c2426c);
        if (c2458hZzi == null) {
            return;
        }
        c2458hZzi.m5074o();
    }

    private static C2458h zzi(C2426c c2426c) {
        boolean zMo5025u0;
        if (c2426c == null) {
            return null;
        }
        C2622l.m5354d("Must be called from the main thread.");
        try {
            zMo5025u0 = c2426c.f11188b.mo5025u0();
        } catch (RemoteException e) {
            AbstractC2436h.f11187a.m5120b(e, "Unable to call %s on %s.", "isConnected", InterfaceC2435g0.class.getSimpleName());
            zMo5025u0 = false;
        }
        if (!zMo5025u0) {
            return null;
        }
        C2622l.m5354d("Must be called from the main thread.");
        return c2426c.f11176l;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        C2422a c2422aM4995a = C2422a.m4995a(context);
        Objects.requireNonNull(c2422aM4995a);
        C2622l.m5354d("Must be called from the main thread.");
        C2438i c2438i = c2422aM4995a.f11145e;
        switch (action) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                onReceiveActionRewind(c2438i.m5033b(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                onReceiveActionSkipNext(c2438i.m5033b());
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                onReceiveActionSkipPrev(c2438i.m5033b());
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                c2438i.m5032a(true);
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                c2438i.m5032a(false);
                break;
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                onReceiveActionTogglePlayback(c2438i.m5033b());
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                onReceiveActionForward(c2438i.m5033b(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "android.intent.action.MEDIA_BUTTON":
                onReceiveActionMediaButton(c2438i.m5033b(), intent);
                break;
            default:
                onReceiveOtherAction(context, action, intent);
                break;
        }
    }

    public void onReceiveActionForward(AbstractC2436h abstractC2436h, long j2) {
        if (abstractC2436h instanceof C2426c) {
            zza((C2426c) abstractC2436h, j2);
        }
    }

    public void onReceiveActionMediaButton(AbstractC2436h abstractC2436h, Intent intent) {
        KeyEvent keyEvent;
        if ((abstractC2436h instanceof C2426c) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            zzh((C2426c) abstractC2436h);
        }
    }

    public void onReceiveActionRewind(AbstractC2436h abstractC2436h, long j2) {
        if (abstractC2436h instanceof C2426c) {
            zza((C2426c) abstractC2436h, -j2);
        }
    }

    public void onReceiveActionSkipNext(AbstractC2436h abstractC2436h) {
        C2458h c2458hZzi;
        if (!(abstractC2436h instanceof C2426c) || (c2458hZzi = zzi((C2426c) abstractC2436h)) == null || c2458hZzi.m5073n()) {
            return;
        }
        C2622l.m5354d("Must be called from the main thread.");
        if (c2458hZzi.m5079v()) {
            C2458h.m5059p(new C2483m(c2458hZzi, null));
        } else {
            C2458h.m5060q(17, null);
        }
    }

    public void onReceiveActionSkipPrev(AbstractC2436h abstractC2436h) {
        C2458h c2458hZzi;
        if (!(abstractC2436h instanceof C2426c) || (c2458hZzi = zzi((C2426c) abstractC2436h)) == null || c2458hZzi.m5073n()) {
            return;
        }
        C2622l.m5354d("Must be called from the main thread.");
        if (c2458hZzi.m5079v()) {
            C2458h.m5059p(new C2481l(c2458hZzi, null));
        } else {
            C2458h.m5060q(17, null);
        }
    }

    public void onReceiveActionTogglePlayback(AbstractC2436h abstractC2436h) {
        if (abstractC2436h instanceof C2426c) {
            zzh((C2426c) abstractC2436h);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
