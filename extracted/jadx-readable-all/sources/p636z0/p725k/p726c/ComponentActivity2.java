package p636z0.p725k.p726c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p739l.KeyEventDispatcher;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.ReportFragment;

/* JADX INFO: renamed from: z0.k.c.f, reason: use source file name */
/* JADX INFO: compiled from: ComponentActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity2 extends Activity implements LifecycleOwner, KeyEventDispatcher.a {

    /* JADX INFO: renamed from: f */
    public LifecycleRegistry f37684f;

    public ComponentActivity2() {
        new SimpleArrayMap();
        this.f37684f = new LifecycleRegistry(this);
    }

    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f37684f;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m16289a(decorView, keyEvent)) {
            return KeyEventDispatcher.m16290b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m16289a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m16746c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LifecycleRegistry lifecycleRegistry = this.f37684f;
        Lifecycle3.b bVar = Lifecycle3.b.CREATED;
        lifecycleRegistry.m16732e("markState");
        lifecycleRegistry.m16732e("setCurrentState");
        lifecycleRegistry.m16734h(bVar);
        super.onSaveInstanceState(bundle);
    }

    @Override // p636z0.p725k.p739l.KeyEventDispatcher.a
    /* JADX INFO: renamed from: u */
    public boolean mo14678u(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
