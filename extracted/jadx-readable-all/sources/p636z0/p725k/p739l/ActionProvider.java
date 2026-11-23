package p636z0.p725k.p739l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.l.b, reason: use source file name */
/* JADX INFO: compiled from: ActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionProvider {

    /* JADX INFO: renamed from: a */
    public a f38013a;

    /* JADX INFO: renamed from: z0.k.l.b$a */
    /* JADX INFO: compiled from: ActionProvider.java */
    public interface a {
    }

    public ActionProvider(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo14805a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo14809b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo14806c();

    /* JADX INFO: renamed from: d */
    public View mo14810d(MenuItem menuItem) {
        return mo14806c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo14807e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo14808f(SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo14811g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo14812h(a aVar) {
        if (this.f38013a != null) {
            StringBuilder sbM1556G = outline.m1556G("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sbM1556G.append(getClass().getSimpleName());
            sbM1556G.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sbM1556G.toString());
        }
        this.f38013a = aVar;
    }
}
