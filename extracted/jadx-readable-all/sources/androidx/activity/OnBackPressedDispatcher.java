package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayDeque;
import java.util.Iterator;
import p636z0.p637a.Cancellable;
import p636z0.p637a.OnBackPressedCallback;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    public final Runnable f163a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<OnBackPressedCallback> f164b;

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* JADX INFO: renamed from: f */
        public final Lifecycle3 f165f;

        /* JADX INFO: renamed from: g */
        public final OnBackPressedCallback f166g;

        /* JADX INFO: renamed from: h */
        public Cancellable f167h;

        public LifecycleOnBackPressedCancellable(Lifecycle3 lifecycle3, OnBackPressedCallback onBackPressedCallback) {
            this.f165f = lifecycle3;
            this.f166g = onBackPressedCallback;
            lifecycle3.mo16727a(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: c */
        public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
            if (aVar == Lifecycle3.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                OnBackPressedCallback onBackPressedCallback = this.f166g;
                onBackPressedDispatcher.f164b.add(onBackPressedCallback);
                C0048a c0048a = onBackPressedDispatcher.new C0048a(onBackPressedCallback);
                onBackPressedCallback.f34168b.add(c0048a);
                this.f167h = c0048a;
                return;
            }
            if (aVar != Lifecycle3.a.ON_STOP) {
                if (aVar == Lifecycle3.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.f167h;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }

        @Override // p636z0.p637a.Cancellable
        public void cancel() {
            this.f165f.mo16729c(this);
            this.f166g.f34168b.remove(this);
            Cancellable cancellable = this.f167h;
            if (cancellable != null) {
                cancellable.cancel();
                this.f167h = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0048a implements Cancellable {

        /* JADX INFO: renamed from: f */
        public final OnBackPressedCallback f169f;

        public C0048a(OnBackPressedCallback onBackPressedCallback) {
            this.f169f = onBackPressedCallback;
        }

        @Override // p636z0.p637a.Cancellable
        public void cancel() {
            OnBackPressedDispatcher.this.f164b.remove(this.f169f);
            this.f169f.f34168b.remove(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: a */
    public void m132a(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        Lifecycle3 lifecycle3Mo124b = lifecycleOwner.mo124b();
        if (lifecycle3Mo124b.mo16728b() == Lifecycle3.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.f34168b.add(new LifecycleOnBackPressedCancellable(lifecycle3Mo124b, onBackPressedCallback));
    }

    /* JADX INFO: renamed from: b */
    public void m133b() {
        Iterator<OnBackPressedCallback> itDescendingIterator = this.f164b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            OnBackPressedCallback next = itDescendingIterator.next();
            if (next.f34167a) {
                next.mo455a();
                return;
            }
        }
        Runnable runnable = this.f163a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f164b = new ArrayDeque<>();
        this.f163a = runnable;
    }
}
