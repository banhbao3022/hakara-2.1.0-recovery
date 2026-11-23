package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: c.n.b.d.j.a.du */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2968du extends MutableContextWrapper {

    /* JADX INFO: renamed from: a */
    public Activity f13385a;

    /* JADX INFO: renamed from: b */
    public Context f13386b;

    /* JADX INFO: renamed from: c */
    public Context f13387c;

    public C2968du(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f13387c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13386b = applicationContext;
        this.f13385a = context instanceof Activity ? (Activity) context : null;
        this.f13387c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f13385a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f13386b.startActivity(intent);
        }
    }
}
