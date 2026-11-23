package p636z0.p654b0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p655c.p656a.p658b.SafeIterableMap;

/* JADX INFO: renamed from: z0.b0.a, reason: use source file name */
/* JADX INFO: compiled from: SavedStateRegistry.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: b */
    public Bundle f35296b;

    /* JADX INFO: renamed from: c */
    public boolean f35297c;

    /* JADX INFO: renamed from: d */
    public Recreator.C0182a f35298d;

    /* JADX INFO: renamed from: a */
    public SafeIterableMap<String, b> f35295a = new SafeIterableMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f35299e = true;

    /* JADX INFO: renamed from: z0.b0.a$a */
    /* JADX INFO: compiled from: SavedStateRegistry.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo436a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* JADX INFO: renamed from: z0.b0.a$b */
    /* JADX INFO: compiled from: SavedStateRegistry.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo867a();
    }

    /* JADX INFO: renamed from: a */
    public Bundle m15018a(String str) {
        if (!this.f35297c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f35296b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f35296b.remove(str);
        if (this.f35296b.isEmpty()) {
            this.f35296b = null;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public void m15019b(String str, b bVar) {
        if (this.f35295a.mo15029j(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15020c(Class<? extends a> cls) {
        if (!this.f35299e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f35298d == null) {
            this.f35298d = new Recreator.C0182a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.C0182a c0182a = this.f35298d;
            c0182a.f1169a.add(cls.getName());
        } catch (NoSuchMethodException e) {
            StringBuilder sbM1556G = outline.m1556G("Class");
            sbM1556G.append(cls.getSimpleName());
            sbM1556G.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbM1556G.toString(), e);
        }
    }
}
