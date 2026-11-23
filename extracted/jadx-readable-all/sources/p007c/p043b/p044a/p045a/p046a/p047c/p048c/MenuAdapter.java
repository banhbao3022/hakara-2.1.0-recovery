package p007c.p043b.p044a.p045a.p046a.p047c.p048c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import mtp.media.karaoke.R;
import p007c.p043b.p044a.p045a.p046a.p047c.MenuItem;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.b.a.a.a.c.c.b, reason: use source file name */
/* JADX INFO: compiled from: MenuAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MenuAdapter extends RecyclerView.AbstractC0152e<a> {

    /* JADX INFO: renamed from: d */
    public final Context f1852d;

    /* JADX INFO: renamed from: e */
    public final List<MenuItem> f1853e;

    /* JADX INFO: renamed from: c.b.a.a.a.c.c.b$a */
    /* JADX INFO: compiled from: MenuAdapter.kt */
    public final class a extends RecyclerView.AbstractC0149b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f1854u;

        /* JADX INFO: renamed from: v */
        public final View f1855v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MenuAdapter menuAdapter, View view) {
            super(view);
            Intrinsics2.m13090f(view, "root");
            this.f1855v = view;
            View viewFindViewById = view.findViewById(R.id.text);
            Intrinsics2.m13086b(viewFindViewById, "root.findViewById(R.id.text)");
            this.f1854u = (TextView) viewFindViewById;
        }
    }

    public MenuAdapter(Context context, List<MenuItem> list) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(list, "menuItems");
        this.f1852d = context;
        this.f1853e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f1853e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        a aVar = (a) abstractC0149b0;
        Intrinsics2.m13090f(aVar, "holder");
        aVar.f1855v.setOnClickListener(this.f1853e.get(i).f1848c);
        aVar.f1854u.setText(this.f1853e.get(i).f1846a);
        Integer num = this.f1853e.get(i).f1847b;
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = aVar.f1854u;
            Context context = this.f1852d;
            Object obj = ContextCompat.f37815a;
            textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.c.m16141b(context, iIntValue), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0149b0 mo667i(ViewGroup viewGroup, int i) {
        Intrinsics2.m13090f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ayp_menu_item, viewGroup, false);
        Intrinsics2.m13086b(viewInflate, "view");
        return new a(this, viewInflate);
    }
}
