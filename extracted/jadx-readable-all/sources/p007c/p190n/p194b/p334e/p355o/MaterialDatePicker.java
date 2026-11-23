package p007c.p190n.p194b.p334e.p355o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p356p.InsetDialogOnTouchListener;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.DialogFragment;

/* JADX INFO: renamed from: c.n.b.e.o.n, reason: use source file name */
/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f25263s0 = 0;

    /* JADX INFO: renamed from: A0 */
    public CalendarConstraints f25264A0;

    /* JADX INFO: renamed from: B0 */
    public MaterialCalendar<S> f25265B0;

    /* JADX INFO: renamed from: C0 */
    public int f25266C0;

    /* JADX INFO: renamed from: D0 */
    public CharSequence f25267D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f25268E0;

    /* JADX INFO: renamed from: F0 */
    public int f25269F0;

    /* JADX INFO: renamed from: G0 */
    public TextView f25270G0;

    /* JADX INFO: renamed from: H0 */
    public CheckableImageButton f25271H0;

    /* JADX INFO: renamed from: I0 */
    public MaterialShapeDrawable f25272I0;

    /* JADX INFO: renamed from: J0 */
    public Button f25273J0;

    /* JADX INFO: renamed from: t0 */
    public final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> f25274t0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: u0 */
    public final LinkedHashSet<View.OnClickListener> f25275u0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: v0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f25276v0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: w0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f25277w0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: x0 */
    public int f25278x0;

    /* JADX INFO: renamed from: y0 */
    public DateSelector<S> f25279y0;

    /* JADX INFO: renamed from: z0 */
    public PickerFragment<S> f25280z0;

    /* JADX INFO: renamed from: c.n.b.e.o.n$a */
    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<MaterialPickerOnPositiveButtonClickListener<? super S>> it = MaterialDatePicker.this.f25274t0.iterator();
            while (it.hasNext()) {
                it.next().m11234a(MaterialDatePicker.this.f25279y0.m11214C());
            }
            MaterialDatePicker.this.m16508X0(false, false);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.n$b */
    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = MaterialDatePicker.this.f25275u0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            MaterialDatePicker.this.m16508X0(false, false);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.n$c */
    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class c extends OnSelectionChangedListener<S> {
        public c() {
        }

        @Override // p007c.p190n.p194b.p334e.p355o.OnSelectionChangedListener
        /* JADX INFO: renamed from: a */
        public void mo11233a(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            int i = MaterialDatePicker.f25263s0;
            materialDatePicker.m11231h1();
            MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
            materialDatePicker2.f25273J0.setEnabled(materialDatePicker2.f25279y0.m11220y());
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static int m11227d1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM11254d = UtcDates.m11254d();
        calendarM11254d.set(5, 1);
        Calendar calendarM11252b = UtcDates.m11252b(calendarM11254d);
        calendarM11252b.get(2);
        calendarM11252b.get(1);
        int maximum = calendarM11252b.getMaximum(7);
        calendarM11252b.getActualMaximum(5);
        calendarM11252b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: e1 */
    public static boolean m11228e1(Context context) {
        return m11229f1(context, android.R.attr.windowFullscreen);
    }

    /* JADX INFO: renamed from: f1 */
    public static boolean m11229f1(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m11351c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public final Dialog mo2217Z0(Bundle bundle) {
        Context contextM16528G0 = m16528G0();
        Context contextM16528G1 = m16528G0();
        int iM11219v = this.f25278x0;
        if (iM11219v == 0) {
            iM11219v = this.f25279y0.m11219v(contextM16528G1);
        }
        Dialog dialog = new Dialog(contextM16528G0, iM11219v);
        Context context = dialog.getContext();
        this.f25268E0 = m11228e1(context);
        int iM11351c = MaterialAttributes.m11351c(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, 2132017909);
        this.f25272I0 = materialShapeDrawable;
        materialShapeDrawable.m11378n(context);
        this.f25272I0.m11381q(ColorStateList.valueOf(iM11351c));
        MaterialShapeDrawable materialShapeDrawable2 = this.f25272I0;
        View decorView = dialog.getWindow().getDecorView();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        materialShapeDrawable2.m11380p(decorView.getElevation());
        return dialog;
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public final void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        if (bundle == null) {
            bundle = this.f38438m;
        }
        this.f25278x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f25279y0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f25264A0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f25266C0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f25267D0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f25269F0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public final View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f25268E0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f25268E0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m11227d1(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(R.id.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(m11227d1(context), -1));
            Resources resources = m16528G0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = MonthAdapter.f25296f;
            viewFindViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f25270G0 = textView;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        textView.setAccessibilityLiveRegion(1);
        this.f25271H0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f25267D0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f25266C0);
        }
        this.f25271H0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f25271H0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.m14707b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.m14707b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f25271H0.setChecked(this.f25269F0 != 0);
        ViewCompat.m16327u(this.f25271H0, null);
        m11232i1(this.f25271H0);
        this.f25271H0.setOnClickListener(new MaterialDatePicker2(this));
        this.f25273J0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (this.f25279y0.m11220y()) {
            this.f25273J0.setEnabled(true);
        } else {
            this.f25273J0.setEnabled(false);
        }
        this.f25273J0.setTag("CONFIRM_BUTTON_TAG");
        this.f25273J0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return viewInflate;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m11230g1() {
        PickerFragment<S> materialTextInputPicker;
        Context contextM16528G0 = m16528G0();
        int iM11219v = this.f25278x0;
        if (iM11219v == 0) {
            iM11219v = this.f25279y0.m11219v(contextM16528G0);
        }
        DateSelector<S> dateSelector = this.f25279y0;
        CalendarConstraints calendarConstraints = this.f25264A0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM11219v);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f25203i);
        materialCalendar.m16540M0(bundle);
        this.f25265B0 = materialCalendar;
        if (this.f25271H0.isChecked()) {
            DateSelector<S> dateSelector2 = this.f25279y0;
            CalendarConstraints calendarConstraints2 = this.f25264A0;
            materialTextInputPicker = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iM11219v);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.m16540M0(bundle2);
        } else {
            materialTextInputPicker = this.f25265B0;
        }
        this.f25280z0 = materialTextInputPicker;
        m11231h1();
        BackStackRecord backStackRecord = new BackStackRecord(m16570w());
        backStackRecord.m16506i(R.id.mtrl_calendar_frame, this.f25280z0, null);
        backStackRecord.mo16445d();
        this.f25280z0.mo11222W0(new c());
    }

    /* JADX INFO: renamed from: h1 */
    public final void m11231h1() {
        String strM11216j = this.f25279y0.m11216j(m16571x());
        this.f25270G0.setContentDescription(String.format(m16546Q(R.string.mtrl_picker_announce_current_selection), strM11216j));
        this.f25270G0.setText(strM11216j);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m11232i1(CheckableImageButton checkableImageButton) {
        this.f25271H0.setContentDescription(this.f25271H0.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // p636z0.p752p.p753c.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f25276v0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f25277w0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f38416M;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public final void mo470t0(Bundle bundle) {
        super.mo470t0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f25278x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f25279y0);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f25264A0);
        Month month = this.f25265B0.f25239h0;
        if (month != null) {
            bVar.f25210e = Long.valueOf(month.f25294k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f25211f);
        Month monthM11236l = Month.m11236l(bVar.f25208c);
        Month monthM11236l2 = Month.m11236l(bVar.f25209d);
        CalendarConstraints.c cVar = (CalendarConstraints.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f25210e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM11236l, monthM11236l2, cVar, l == null ? null : Month.m11236l(l.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f25266C0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f25267D0);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        super.mo1958u0();
        Window window = m16509a1().getWindow();
        if (this.f25268E0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f25272I0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m16539M().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f25272I0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(m16509a1(), rect));
        }
        m11230g1();
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: v0 */
    public void mo1959v0() {
        this.f25280z0.f25311c0.clear();
        this.f38414K = true;
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
