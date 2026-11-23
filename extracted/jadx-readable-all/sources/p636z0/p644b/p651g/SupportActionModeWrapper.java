package p636z0.p644b.p651g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p636z0.p644b.p651g.p652i.MenuItemWrapperICS;
import p636z0.p644b.p651g.p652i.MenuWrapperICS;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p733g.p734a.SupportMenu;
import p636z0.p725k.p733g.p734a.SupportMenuItem;

/* JADX INFO: renamed from: z0.b.g.e, reason: use source file name */
/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class SupportActionModeWrapper extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f34678a;

    /* JADX INFO: renamed from: b */
    public final ActionMode f34679b;

    /* JADX INFO: renamed from: z0.b.g.e$a */
    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    public static class a implements ActionMode.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f34680a;

        /* JADX INFO: renamed from: b */
        public final Context f34681b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<SupportActionModeWrapper> f34682c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final SimpleArrayMap<Menu, Menu> f34683d = new SimpleArrayMap<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f34681b = context;
            this.f34680a = callback;
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: a */
        public void mo14665a(ActionMode actionMode) {
            this.f34680a.onDestroyActionMode(m14730e(actionMode));
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: b */
        public boolean mo14666b(ActionMode actionMode, Menu menu) {
            return this.f34680a.onCreateActionMode(m14730e(actionMode), m14731f(menu));
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: c */
        public boolean mo14667c(ActionMode actionMode, Menu menu) {
            return this.f34680a.onPrepareActionMode(m14730e(actionMode), m14731f(menu));
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: d */
        public boolean mo14668d(ActionMode actionMode, MenuItem menuItem) {
            return this.f34680a.onActionItemClicked(m14730e(actionMode), new MenuItemWrapperICS(this.f34681b, (SupportMenuItem) menuItem));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m14730e(ActionMode actionMode) {
            int size = this.f34682c.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = this.f34682c.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f34679b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f34681b, actionMode);
            this.f34682c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        /* JADX INFO: renamed from: f */
        public final Menu m14731f(Menu menu) {
            Menu orDefault = this.f34683d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            MenuWrapperICS menuWrapperICS = new MenuWrapperICS(this.f34681b, (SupportMenu) menu);
            this.f34683d.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f34678a = context;
        this.f34679b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f34679b.mo14692c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f34679b.mo14693d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuWrapperICS(this.f34678a, (SupportMenu) this.f34679b.mo14694e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f34679b.mo14695f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f34679b.mo14696g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f34679b.f34665f;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f34679b.mo14697h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f34679b.f34666g;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f34679b.mo14698i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f34679b.mo14699j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f34679b.mo14700k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f34679b.mo14702m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f34679b.f34665f = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f34679b.mo14704o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f34679b.mo14705p(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f34679b.mo14701l(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f34679b.mo14703n(i);
    }
}
