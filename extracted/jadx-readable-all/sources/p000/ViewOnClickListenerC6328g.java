package p000;

import android.view.View;
import p007c.p043b.p044a.p045a.p046a.DefaultPlayerUiController;
import p007c.p043b.p044a.p045a.p046a.p049d.FadeViewHelper;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC6328g implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f29831f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f29832g;

    public ViewOnClickListenerC6328g(int i, Object obj) {
        this.f29831f = i;
        this.f29832g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f29831f;
        if (i == 0) {
            FadeViewHelper fadeViewHelper = ((DefaultPlayerUiController) this.f29832g).f1837u;
            fadeViewHelper.m1314b(fadeViewHelper.f1858h ? 0.0f : 1.0f);
            return;
        }
        if (i == 1) {
            DefaultPlayerUiController defaultPlayerUiController = (DefaultPlayerUiController) this.f29832g;
            if (defaultPlayerUiController.f1838v) {
                defaultPlayerUiController.f1841y.pause();
                return;
            } else {
                defaultPlayerUiController.f1841y.mo1318U();
                return;
            }
        }
        if (i == 2) {
            DefaultPlayerUiController defaultPlayerUiController2 = (DefaultPlayerUiController) this.f29832g;
            defaultPlayerUiController2.f1835s.onClick(defaultPlayerUiController2.f1831o);
        } else {
            if (i != 3) {
                throw null;
            }
            DefaultPlayerUiController defaultPlayerUiController3 = (DefaultPlayerUiController) this.f29832g;
            defaultPlayerUiController3.f1836t.onClick(defaultPlayerUiController3.f1828l);
        }
    }
}
