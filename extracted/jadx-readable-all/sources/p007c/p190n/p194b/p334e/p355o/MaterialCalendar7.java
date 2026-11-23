package p007c.p190n.p194b.p334e.p355o;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.o.m, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar7 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MonthsPagerAdapter2 f25261f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MaterialCalendar f25262g;

    public MaterialCalendar7(MaterialCalendar materialCalendar, MonthsPagerAdapter2 monthsPagerAdapter2) {
        this.f25262g = materialCalendar;
        this.f25261f = monthsPagerAdapter2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM548n1 = this.f25262g.m11223X0().m548n1() - 1;
        if (iM548n1 >= 0) {
            this.f25262g.m11225Z0(this.f25261f.m11248n(iM548n1));
        }
    }
}
