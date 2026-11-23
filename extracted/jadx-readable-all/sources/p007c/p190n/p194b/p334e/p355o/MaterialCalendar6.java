package p007c.p190n.p194b.p334e.p355o;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.o.l, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar6 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MonthsPagerAdapter2 f25259f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MaterialCalendar f25260g;

    public MaterialCalendar6(MaterialCalendar materialCalendar, MonthsPagerAdapter2 monthsPagerAdapter2) {
        this.f25260g = materialCalendar;
        this.f25259f = monthsPagerAdapter2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM545l1 = this.f25260g.m11223X0().m545l1() + 1;
        if (iM545l1 < this.f25260g.f25243l0.getAdapter().mo662d()) {
            this.f25260g.m11225Z0(this.f25259f.m11248n(iM545l1));
        }
    }
}
