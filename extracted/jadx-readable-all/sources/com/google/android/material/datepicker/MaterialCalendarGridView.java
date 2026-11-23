package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p355o.CalendarStyle;
import p007c.p190n.p194b.p334e.p355o.DateSelector;
import p007c.p190n.p194b.p334e.p355o.MaterialDatePicker;
import p007c.p190n.p194b.p334e.p355o.MonthAdapter;
import p007c.p190n.p194b.p334e.p355o.UtcDates;
import p636z0.p725k.p738k.Pair;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: f */
    public final Calendar f28945f;

    /* JADX INFO: renamed from: g */
    public final boolean f28946g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C5945a extends AccessibilityDelegateCompat {
        public C5945a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            accessibilityNodeInfoCompat.m16272p(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM11242a;
        int width;
        int iM11242a2;
        int width2;
        int width3;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f25298h;
        CalendarStyle calendarStyle = adapter.f25300j;
        Long item = adapter.getItem(adapter.m11243b());
        Long item2 = adapter.getItem(adapter.m11245d());
        for (Pair<Long, Long> pair : dateSelector.m11217m()) {
            Long l = pair.f37971a;
            if (l != null) {
                if (pair.f37972b != null) {
                    long jLongValue = l.longValue();
                    long jLongValue2 = pair.f37972b.longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Long lValueOf2 = Long.valueOf(jLongValue2);
                    if (!(item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue())) {
                        boolean zM10975Z = C4799a.m10975Z(this);
                        if (jLongValue < item.longValue()) {
                            iM11242a = adapter.m11243b();
                            width = iM11242a % adapter.f25297g.f25292i == 0 ? 0 : !zM10975Z ? materialCalendarGridView.getChildAt(iM11242a - 1).getRight() : materialCalendarGridView.getChildAt(iM11242a - 1).getLeft();
                        } else {
                            materialCalendarGridView.f28945f.setTimeInMillis(jLongValue);
                            iM11242a = adapter.m11242a(materialCalendarGridView.f28945f.get(5));
                            View childAt = materialCalendarGridView.getChildAt(iM11242a);
                            width = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iM11242a2 = Math.min(adapter.m11245d(), getChildCount() - 1);
                            width2 = (iM11242a2 + 1) % adapter.f25297g.f25292i == 0 ? getWidth() : !zM10975Z ? materialCalendarGridView.getChildAt(iM11242a2).getRight() : materialCalendarGridView.getChildAt(iM11242a2).getLeft();
                        } else {
                            materialCalendarGridView.f28945f.setTimeInMillis(jLongValue2);
                            iM11242a2 = adapter.m11242a(materialCalendarGridView.f28945f.get(5));
                            View childAt2 = materialCalendarGridView.getChildAt(iM11242a2);
                            width2 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(iM11242a);
                        int itemId2 = (int) adapter.getItemId(iM11242a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + calendarStyle.f25222a.f25214a.top;
                            int bottom = childAt3.getBottom() - calendarStyle.f25222a.f25214a.bottom;
                            if (zM10975Z) {
                                int i2 = iM11242a2 > numColumns2 ? 0 : width2;
                                width3 = numColumns > iM11242a ? getWidth() : width;
                                i = i2;
                            } else {
                                i = numColumns > iM11242a ? 0 : width;
                                width3 = iM11242a2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, calendarStyle.f25229h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
            adapter = adapter;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().m11245d());
        } else if (i == 130) {
            setSelection(getAdapter().m11243b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m11243b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m11243b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f28946g) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().m11243b()) {
            super.setSelection(getAdapter().m11243b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28945f = UtcDates.m11255e();
        if (MaterialDatePicker.m11228e1(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f28946g = MaterialDatePicker.m11229f1(getContext(), R.attr.nestedScrollable);
        ViewCompat.m16327u(this, new C5945a(this));
    }
}
