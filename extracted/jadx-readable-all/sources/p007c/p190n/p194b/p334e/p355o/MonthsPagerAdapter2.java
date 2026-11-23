package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewCompat5;

/* JADX INFO: renamed from: c.n.b.e.o.u, reason: use source file name */
/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class MonthsPagerAdapter2 extends RecyclerView.AbstractC0152e<a> {

    /* JADX INFO: renamed from: d */
    public final Context f25304d;

    /* JADX INFO: renamed from: e */
    public final CalendarConstraints f25305e;

    /* JADX INFO: renamed from: f */
    public final DateSelector<?> f25306f;

    /* JADX INFO: renamed from: g */
    public final MaterialCalendar.e f25307g;

    /* JADX INFO: renamed from: h */
    public final int f25308h;

    /* JADX INFO: renamed from: c.n.b.e.o.u$a */
    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.AbstractC0149b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f25309u;

        /* JADX INFO: renamed from: v */
        public final MaterialCalendarGridView f25310v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f25309u = textView;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            ViewCompat5 viewCompat5 = new ViewCompat5(R.id.tag_accessibility_heading, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            if (Build.VERSION.SDK_INT >= 28) {
                viewCompat5.m16342d(textView, bool);
            } else if (viewCompat5.m16343e(viewCompat5.m16332c(textView), bool)) {
                AccessibilityDelegateCompat accessibilityDelegateCompatM16313g = ViewCompat.m16313g(textView);
                ViewCompat.m16327u(textView, accessibilityDelegateCompatM16313g == null ? new AccessibilityDelegateCompat() : accessibilityDelegateCompatM16313g);
                textView.setTag(R.id.tag_accessibility_heading, bool);
                ViewCompat.m16318l(textView, 0);
            }
            this.f25310v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter2(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.e eVar) {
        Month month = calendarConstraints.f25200f;
        Month month2 = calendarConstraints.f25201g;
        Month month3 = calendarConstraints.f25203i;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = MonthAdapter.f25296f;
        int i2 = MaterialCalendar.f25235d0;
        int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
        int dimensionPixelSize2 = MaterialDatePicker.m11228e1(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.f25304d = context;
        this.f25308h = dimensionPixelSize + dimensionPixelSize2;
        this.f25305e = calendarConstraints;
        this.f25306f = dateSelector;
        this.f25307g = eVar;
        if (this.f1023a.m672a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1024b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f25305e.f25205k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: e */
    public long mo663e(int i) {
        return this.f25305e.f25200f.m11237A(i).f25289f.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        a aVar = (a) abstractC0149b0;
        Month monthM11237A = this.f25305e.f25200f.m11237A(i);
        aVar.f25309u.setText(monthM11237A.m11241w(aVar.f1003b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f25310v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthM11237A.equals(materialCalendarGridView.getAdapter().f25297g)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthM11237A, this.f25306f, this.f25305e);
            materialCalendarGridView.setNumColumns(monthM11237A.f25292i);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter monthAdapterM12788a = materialCalendarGridView.getAdapter();
            Iterator<Long> it = monthAdapterM12788a.f25299i.iterator();
            while (it.hasNext()) {
                monthAdapterM12788a.m11247f(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = monthAdapterM12788a.f25298h;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.m11221z().iterator();
                while (it2.hasNext()) {
                    monthAdapterM12788a.m11247f(materialCalendarGridView, it2.next().longValue());
                }
                monthAdapterM12788a.f25299i = monthAdapterM12788a.f25298h.m11221z();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new MonthsPagerAdapter(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0149b0 mo667i(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m11228e1(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0161n(-1, this.f25308h));
        return new a(linearLayout, true);
    }

    /* JADX INFO: renamed from: n */
    public Month m11248n(int i) {
        return this.f25305e.f25200f.m11237A(i);
    }

    /* JADX INFO: renamed from: o */
    public int m11249o(Month month) {
        return this.f25305e.f25200f.m11238B(month);
    }
}
