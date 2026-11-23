package p636z0.p644b.p651g;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: z0.b.g.a, reason: use source file name */
/* JADX INFO: compiled from: ActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: f */
    public Object f34665f;

    /* JADX INFO: renamed from: g */
    public boolean f34666g;

    /* JADX INFO: renamed from: z0.b.g.a$a */
    /* JADX INFO: compiled from: ActionMode.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14665a(ActionMode actionMode);

        /* JADX INFO: renamed from: b */
        boolean mo14666b(ActionMode actionMode, Menu menu);

        /* JADX INFO: renamed from: c */
        boolean mo14667c(ActionMode actionMode, Menu menu);

        /* JADX INFO: renamed from: d */
        boolean mo14668d(ActionMode actionMode, MenuItem menuItem);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo14692c();

    /* JADX INFO: renamed from: d */
    public abstract View mo14693d();

    /* JADX INFO: renamed from: e */
    public abstract Menu mo14694e();

    /* JADX INFO: renamed from: f */
    public abstract MenuInflater mo14695f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo14696g();

    /* JADX INFO: renamed from: h */
    public abstract CharSequence mo14697h();

    /* JADX INFO: renamed from: i */
    public abstract void mo14698i();

    /* JADX INFO: renamed from: j */
    public boolean mo14699j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo14700k(View view);

    /* JADX INFO: renamed from: l */
    public abstract void mo14701l(int i);

    /* JADX INFO: renamed from: m */
    public abstract void mo14702m(CharSequence charSequence);

    /* JADX INFO: renamed from: n */
    public abstract void mo14703n(int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo14704o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public void mo14705p(boolean z) {
        this.f34666g = z;
    }
}
