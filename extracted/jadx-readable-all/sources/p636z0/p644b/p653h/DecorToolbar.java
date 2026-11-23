package p636z0.p644b.p653h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;

/* JADX INFO: renamed from: z0.b.h.d0, reason: use source file name */
/* JADX INFO: compiled from: DecorToolbar.java */
/* JADX INFO: loaded from: classes.dex */
public interface DecorToolbar {
    /* JADX INFO: renamed from: a */
    void mo14851a(Menu menu, MenuPresenter.a aVar);

    /* JADX INFO: renamed from: b */
    boolean mo14852b();

    /* JADX INFO: renamed from: c */
    void mo14853c();

    void collapseActionView();

    /* JADX INFO: renamed from: d */
    boolean mo14854d();

    /* JADX INFO: renamed from: e */
    boolean mo14855e();

    /* JADX INFO: renamed from: f */
    boolean mo14856f();

    /* JADX INFO: renamed from: g */
    boolean mo14857g();

    Context getContext();

    CharSequence getTitle();

    /* JADX INFO: renamed from: h */
    void mo14858h();

    /* JADX INFO: renamed from: i */
    void mo14859i(ScrollingTabContainerView2 scrollingTabContainerView2);

    /* JADX INFO: renamed from: j */
    boolean mo14860j();

    /* JADX INFO: renamed from: k */
    void mo14861k(int i);

    /* JADX INFO: renamed from: l */
    Menu mo14862l();

    /* JADX INFO: renamed from: m */
    void mo14863m(int i);

    /* JADX INFO: renamed from: n */
    int mo14864n();

    /* JADX INFO: renamed from: o */
    ViewPropertyAnimatorCompat mo14865o(int i, long j2);

    /* JADX INFO: renamed from: p */
    void mo14866p(MenuPresenter.a aVar, MenuBuilder.a aVar2);

    /* JADX INFO: renamed from: q */
    void mo14867q(int i);

    /* JADX INFO: renamed from: r */
    ViewGroup mo14868r();

    /* JADX INFO: renamed from: s */
    void mo14869s(boolean z);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    int mo14870t();

    /* JADX INFO: renamed from: u */
    void mo14871u();

    /* JADX INFO: renamed from: v */
    void mo14872v();

    /* JADX INFO: renamed from: w */
    void mo14873w(boolean z);
}
