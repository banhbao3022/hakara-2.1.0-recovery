package p636z0.p644b.p651g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: z0.b.g.c, reason: use source file name */
/* JADX INFO: compiled from: ContextThemeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public int f34667a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f34668b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f34669c;

    /* JADX INFO: renamed from: d */
    public Configuration f34670d;

    /* JADX INFO: renamed from: e */
    public Resources f34671e;

    public ContextThemeWrapper() {
        super(null);
    }

    /* JADX INFO: renamed from: a */
    public void m14728a(Configuration configuration) {
        if (this.f34671e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f34670d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f34670d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m14729b() {
        if (this.f34668b == null) {
            this.f34668b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f34668b.setTo(theme);
            }
        }
        this.f34668b.applyStyle(this.f34667a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f34671e == null) {
            Configuration configuration = this.f34670d;
            if (configuration == null) {
                this.f34671e = super.getResources();
            } else {
                this.f34671e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f34671e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f34669c == null) {
            this.f34669c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f34669c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f34668b;
        if (theme != null) {
            return theme;
        }
        if (this.f34667a == 0) {
            this.f34667a = 2132017644;
        }
        m14729b();
        return this.f34668b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f34667a != i) {
            this.f34667a = i;
            m14729b();
        }
    }

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.f34667a = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f34668b = theme;
    }
}
