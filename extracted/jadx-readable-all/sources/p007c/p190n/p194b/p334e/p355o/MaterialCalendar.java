package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p774z.p775b.PagerSnapHelper;

/* JADX INFO: renamed from: c.n.b.e.o.g, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f25235d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public int f25236e0;

    /* JADX INFO: renamed from: f0 */
    public DateSelector<S> f25237f0;

    /* JADX INFO: renamed from: g0 */
    public CalendarConstraints f25238g0;

    /* JADX INFO: renamed from: h0 */
    public Month f25239h0;

    /* JADX INFO: renamed from: i0 */
    public int f25240i0;

    /* JADX INFO: renamed from: j0 */
    public CalendarStyle f25241j0;

    /* JADX INFO: renamed from: k0 */
    public RecyclerView f25242k0;

    /* JADX INFO: renamed from: l0 */
    public RecyclerView f25243l0;

    /* JADX INFO: renamed from: m0 */
    public View f25244m0;

    /* JADX INFO: renamed from: n0 */
    public View f25245n0;

    /* JADX INFO: renamed from: c.n.b.e.o.g$a */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f25246f;

        public a(int i) {
            this.f25246f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f25243l0.m617m0(this.f25246f);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.g$b */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    public class b extends AccessibilityDelegateCompat {
        public b(MaterialCalendar materialCalendar) {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            accessibilityNodeInfoCompat.m16272p(null);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.g$c */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    public class c extends SmoothCalendarLayoutManager {

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ int f25248G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f25248G = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: a1 */
        public void mo527a1(RecyclerView.C0172y c0172y, int[] iArr) {
            if (this.f25248G == 0) {
                iArr[0] = MaterialCalendar.this.f25243l0.getWidth();
                iArr[1] = MaterialCalendar.this.f25243l0.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f25243l0.getHeight();
                iArr[1] = MaterialCalendar.this.f25243l0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.g$d */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    public class d implements e {
        public d() {
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.g$e */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    public interface e {
    }

    @Override // p007c.p190n.p194b.p334e.p355o.PickerFragment
    /* JADX INFO: renamed from: W0 */
    public boolean mo11222W0(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f25311c0.add(onSelectionChangedListener);
    }

    /* JADX INFO: renamed from: X0 */
    public LinearLayoutManager m11223X0() {
        return (LinearLayoutManager) this.f25243l0.getLayoutManager();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m11224Y0(int i) {
        this.f25243l0.post(new a(i));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m11225Z0(Month month) {
        MonthsPagerAdapter2 monthsPagerAdapter2 = (MonthsPagerAdapter2) this.f25243l0.getAdapter();
        int iM11238B = monthsPagerAdapter2.f25305e.f25200f.m11238B(month);
        int iM11249o = iM11238B - monthsPagerAdapter2.m11249o(this.f25239h0);
        boolean z = Math.abs(iM11249o) > 3;
        boolean z2 = iM11249o > 0;
        this.f25239h0 = month;
        if (z && z2) {
            this.f25243l0.m612j0(iM11238B - 3);
            m11224Y0(iM11238B);
        } else if (!z) {
            m11224Y0(iM11238B);
        } else {
            this.f25243l0.m612j0(iM11238B + 3);
            m11224Y0(iM11238B);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m11226a1(int i) {
        this.f25240i0 = i;
        if (i == 2) {
            this.f25242k0.getLayoutManager().mo522N0(((YearGridAdapter2) this.f25242k0.getAdapter()).m11213n(this.f25239h0.f25291h));
            this.f25244m0.setVisibility(0);
            this.f25245n0.setVisibility(8);
        } else if (i == 1) {
            this.f25244m0.setVisibility(8);
            this.f25245n0.setVisibility(0);
            m11225Z0(this.f25239h0);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        if (bundle == null) {
            bundle = this.f38438m;
        }
        this.f25236e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f25237f0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f25238g0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f25239h0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m16571x(), this.f25236e0);
        this.f25241j0 = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f25238g0.f25200f;
        if (MaterialDatePicker.m11228e1(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.m16327u(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new DaysOfWeekAdapter());
        gridView.setNumColumns(month.f25292i);
        gridView.setEnabled(false);
        this.f25243l0 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f25243l0.setLayoutManager(new c(m16571x(), i2, false, i2));
        this.f25243l0.setTag("MONTHS_VIEW_GROUP_TAG");
        MonthsPagerAdapter2 monthsPagerAdapter2 = new MonthsPagerAdapter2(contextThemeWrapper, this.f25237f0, this.f25238g0, new d());
        this.f25243l0.setAdapter(monthsPagerAdapter2);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f25242k0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f25242k0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f25242k0.setAdapter(new YearGridAdapter2(this));
            this.f25242k0.m605g(new MaterialCalendar2(this));
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.m16327u(materialButton, new MaterialCalendar3(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f25244m0 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f25245n0 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m11226a1(1);
            materialButton.setText(this.f25239h0.m11241w(viewInflate.getContext()));
            this.f25243l0.m607h(new MaterialCalendar4(this, monthsPagerAdapter2, materialButton));
            materialButton.setOnClickListener(new MaterialCalendar5(this));
            materialButton3.setOnClickListener(new MaterialCalendar6(this, monthsPagerAdapter2));
            materialButton2.setOnClickListener(new MaterialCalendar7(this, monthsPagerAdapter2));
        }
        if (!MaterialDatePicker.m11228e1(contextThemeWrapper)) {
            new PagerSnapHelper().mo14020b(this.f25243l0);
        }
        this.f25243l0.m612j0(monthsPagerAdapter2.m11249o(this.f25239h0));
        return viewInflate;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f25236e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f25237f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f25238g0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f25239h0);
    }
}
