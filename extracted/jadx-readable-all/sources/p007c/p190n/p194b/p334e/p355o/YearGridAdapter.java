package p007c.p190n.p194b.p334e.p355o;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.o.a0, reason: use source file name */
/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class YearGridAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f25212f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ YearGridAdapter2 f25213g;

    public YearGridAdapter(YearGridAdapter2 yearGridAdapter2, int i) {
        this.f25213g = yearGridAdapter2;
        this.f25212f = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Month monthM11235h = Month.m11235h(this.f25212f, this.f25213g.f25220d.f25239h0.f25290g);
        CalendarConstraints calendarConstraints = this.f25213g.f25220d.f25238g0;
        if (monthM11235h.compareTo(calendarConstraints.f25200f) < 0) {
            monthM11235h = calendarConstraints.f25200f;
        } else if (monthM11235h.compareTo(calendarConstraints.f25201g) > 0) {
            monthM11235h = calendarConstraints.f25201g;
        }
        this.f25213g.f25220d.m11225Z0(monthM11235h);
        this.f25213g.f25220d.m11226a1(1);
    }
}
