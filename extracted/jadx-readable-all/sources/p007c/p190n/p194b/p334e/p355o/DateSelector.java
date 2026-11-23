package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import p636z0.p725k.p738k.Pair;

/* JADX INFO: renamed from: c.n.b.e.o.d, reason: use source file name */
/* JADX INFO: compiled from: DateSelector.java */
/* JADX INFO: loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: renamed from: C */
    S m11214C();

    /* JADX INFO: renamed from: G */
    void m11215G(long j2);

    /* JADX INFO: renamed from: j */
    String m11216j(Context context);

    /* JADX INFO: renamed from: m */
    Collection<Pair<Long, Long>> m11217m();

    /* JADX INFO: renamed from: s */
    View m11218s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<S> onSelectionChangedListener);

    /* JADX INFO: renamed from: v */
    int m11219v(Context context);

    /* JADX INFO: renamed from: y */
    boolean m11220y();

    /* JADX INFO: renamed from: z */
    Collection<Long> m11221z();
}
