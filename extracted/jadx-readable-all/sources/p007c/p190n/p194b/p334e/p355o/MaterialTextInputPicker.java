package p007c.p190n.p194b.p334e.p355o;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.e.o.q, reason: use source file name */
/* JADX INFO: compiled from: MaterialTextInputPicker.java */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: d0 */
    public int f25285d0;

    /* JADX INFO: renamed from: e0 */
    public DateSelector<S> f25286e0;

    /* JADX INFO: renamed from: f0 */
    public CalendarConstraints f25287f0;

    /* JADX INFO: renamed from: c.n.b.e.o.q$a */
    /* JADX INFO: compiled from: MaterialTextInputPicker.java */
    public class a extends OnSelectionChangedListener<S> {
        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p355o.OnSelectionChangedListener
        /* JADX INFO: renamed from: a */
        public void mo11233a(S s) {
            Iterator<OnSelectionChangedListener<S>> it = MaterialTextInputPicker.this.f25311c0.iterator();
            while (it.hasNext()) {
                it.next().mo11233a(s);
            }
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        if (bundle == null) {
            bundle = this.f38438m;
        }
        this.f25285d0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f25286e0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f25287f0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f25286e0.m11218s(layoutInflater.cloneInContext(new ContextThemeWrapper(m16571x(), this.f25285d0)), viewGroup, bundle, this.f25287f0, new a());
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f25285d0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f25286e0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f25287f0);
    }
}
