package p007c.p190n.p194b.p334e.p355o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: c.n.b.e.o.j, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar4 extends RecyclerView.AbstractC0165r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MonthsPagerAdapter2 f25255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f25256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialCalendar f25257c;

    public MaterialCalendar4(MaterialCalendar materialCalendar, MonthsPagerAdapter2 monthsPagerAdapter2, MaterialButton materialButton) {
        this.f25257c = materialCalendar;
        this.f25255a = monthsPagerAdapter2;
        this.f25256b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
    /* JADX INFO: renamed from: a */
    public void mo781a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f25256b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
    /* JADX INFO: renamed from: b */
    public void mo782b(RecyclerView recyclerView, int i, int i2) {
        int iM545l1 = i < 0 ? this.f25257c.m11223X0().m545l1() : this.f25257c.m11223X0().m548n1();
        this.f25257c.f25239h0 = this.f25255a.m11248n(iM545l1);
        MaterialButton materialButton = this.f25256b;
        MonthsPagerAdapter2 monthsPagerAdapter2 = this.f25255a;
        materialButton.setText(monthsPagerAdapter2.f25305e.f25200f.m11237A(iM545l1).m11241w(monthsPagerAdapter2.f25304d));
    }
}
