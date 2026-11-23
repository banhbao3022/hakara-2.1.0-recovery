package p636z0.p644b.p651g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p653h.ActionMenuPresenter;

/* JADX INFO: renamed from: z0.b.g.d, reason: use source file name */
/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.a {

    /* JADX INFO: renamed from: h */
    public Context f34672h;

    /* JADX INFO: renamed from: i */
    public ActionBarContextView f34673i;

    /* JADX INFO: renamed from: j */
    public ActionMode.a f34674j;

    /* JADX INFO: renamed from: k */
    public WeakReference<View> f34675k;

    /* JADX INFO: renamed from: l */
    public boolean f34676l;

    /* JADX INFO: renamed from: m */
    public MenuBuilder f34677m;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.a aVar, boolean z) {
        this.f34672h = context;
        this.f34673i = actionBarContextView;
        this.f34674j = aVar;
        MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
        menuBuilder.f34830m = 1;
        this.f34677m = menuBuilder;
        menuBuilder.f34823f = this;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
    /* JADX INFO: renamed from: a */
    public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f34674j.mo14668d(this, menuItem);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
    /* JADX INFO: renamed from: b */
    public void mo189b(MenuBuilder menuBuilder) {
        mo14698i();
        ActionMenuPresenter actionMenuPresenter = this.f34673i.f34930i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m14848j();
        }
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: c */
    public void mo14692c() {
        if (this.f34676l) {
            return;
        }
        this.f34676l = true;
        this.f34673i.sendAccessibilityEvent(32);
        this.f34674j.mo14665a(this);
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: d */
    public View mo14693d() {
        WeakReference<View> weakReference = this.f34675k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: e */
    public Menu mo14694e() {
        return this.f34677m;
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: f */
    public MenuInflater mo14695f() {
        return new SupportMenuInflater(this.f34673i.getContext());
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: g */
    public CharSequence mo14696g() {
        return this.f34673i.getSubtitle();
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: h */
    public CharSequence mo14697h() {
        return this.f34673i.getTitle();
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: i */
    public void mo14698i() {
        this.f34674j.mo14667c(this, this.f34677m);
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: j */
    public boolean mo14699j() {
        return this.f34673i.f294x;
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: k */
    public void mo14700k(View view) {
        this.f34673i.setCustomView(view);
        this.f34675k = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: l */
    public void mo14701l(int i) {
        this.f34673i.setSubtitle(this.f34672h.getString(i));
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: m */
    public void mo14702m(CharSequence charSequence) {
        this.f34673i.setSubtitle(charSequence);
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: n */
    public void mo14703n(int i) {
        this.f34673i.setTitle(this.f34672h.getString(i));
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: o */
    public void mo14704o(CharSequence charSequence) {
        this.f34673i.setTitle(charSequence);
    }

    @Override // p636z0.p644b.p651g.ActionMode
    /* JADX INFO: renamed from: p */
    public void mo14705p(boolean z) {
        this.f34666g = z;
        this.f34673i.setTitleOptional(z);
    }
}
