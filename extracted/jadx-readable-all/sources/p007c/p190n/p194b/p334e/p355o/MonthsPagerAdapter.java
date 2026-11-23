package p007c.p190n.p194b.p334e.p355o;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.e.o.t, reason: use source file name */
/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class MonthsPagerAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MaterialCalendarGridView f25302f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MonthsPagerAdapter2 f25303g;

    public MonthsPagerAdapter(MonthsPagerAdapter2 monthsPagerAdapter2, MaterialCalendarGridView materialCalendarGridView) {
        this.f25303g = monthsPagerAdapter2;
        this.f25302f = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
        MonthAdapter adapter = this.f25302f.getAdapter();
        if (i >= adapter.m11243b() && i <= adapter.m11245d()) {
            MaterialCalendar.e eVar = this.f25303g.f25307g;
            long jLongValue = this.f25302f.getAdapter().getItem(i).longValue();
            MaterialCalendar.d dVar = (MaterialCalendar.d) eVar;
            if (MaterialCalendar.this.f25238g0.f25202h.mo11210x(jLongValue)) {
                MaterialCalendar.this.f25237f0.m11215G(jLongValue);
                Iterator it = MaterialCalendar.this.f25311c0.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).mo11233a(MaterialCalendar.this.f25237f0.m11214C());
                }
                MaterialCalendar.this.f25243l0.getAdapter().f1023a.m673b();
                RecyclerView recyclerView = MaterialCalendar.this.f25242k0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1023a.m673b();
                }
            }
        }
    }
}
