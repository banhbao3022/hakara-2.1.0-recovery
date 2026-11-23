package com.google.android.exoplayer2.p475ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.DefaultTrackSelector;
import p007c.p190n.p194b.p209b.p263z1.DefaultTrackNameProvider;
import p007c.p190n.p194b.p209b.p263z1.TrackNameProvider;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public final int f28439f;

    /* JADX INFO: renamed from: g */
    public final LayoutInflater f28440g;

    /* JADX INFO: renamed from: h */
    public final CheckedTextView f28441h;

    /* JADX INFO: renamed from: i */
    public final CheckedTextView f28442i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC5887b f28443j;

    /* JADX INFO: renamed from: k */
    public final SparseArray<DefaultTrackSelector.e> f28444k;

    /* JADX INFO: renamed from: l */
    public boolean f28445l;

    /* JADX INFO: renamed from: m */
    public boolean f28446m;

    /* JADX INFO: renamed from: n */
    public TrackNameProvider f28447n;

    /* JADX INFO: renamed from: o */
    public TrackGroupArray f28448o;

    /* JADX INFO: renamed from: p */
    public boolean f28449p;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public class ViewOnClickListenerC5887b implements View.OnClickListener {
        public ViewOnClickListenerC5887b(C5886a c5886a) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            if (view == trackSelectionView.f28441h) {
                trackSelectionView.f28449p = true;
                trackSelectionView.f28444k.clear();
            } else {
                if (view != trackSelectionView.f28442i) {
                    trackSelectionView.f28449p = false;
                    Object tag = view.getTag();
                    Objects.requireNonNull(tag);
                    trackSelectionView.f28444k.get(((C5888c) tag).f28451a);
                    Objects.requireNonNull(null);
                    throw null;
                }
                trackSelectionView.f28449p = false;
                trackSelectionView.f28444k.clear();
            }
            trackSelectionView.m12633a();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public static final class C5888c {

        /* JADX INFO: renamed from: a */
        public final int f28451a;

        /* JADX INFO: renamed from: b */
        public final int f28452b;

        /* JADX INFO: renamed from: c */
        public final Format f28453c;

        public C5888c(int i, int i2, Format format) {
            this.f28451a = i;
            this.f28452b = i2;
            this.f28453c = format;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12633a() {
        this.f28441h.setChecked(this.f28449p);
        this.f28442i.setChecked(!this.f28449p && this.f28444k.size() == 0);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m12634b() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f28441h.setEnabled(false);
                this.f28442i.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f28449p;
    }

    public List<DefaultTrackSelector.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f28444k.size());
        for (int i = 0; i < this.f28444k.size(); i++) {
            arrayList.add(this.f28444k.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f28445l != z) {
            this.f28445l = z;
            m12634b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f28446m != z) {
            this.f28446m = z;
            if (!z && this.f28444k.size() > 1) {
                for (int size = this.f28444k.size() - 1; size > 0; size--) {
                    this.f28444k.remove(size);
                }
            }
            m12634b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f28441h.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        Objects.requireNonNull(trackNameProvider);
        this.f28447n = trackNameProvider;
        m12634b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f28444k = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f28439f = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f28440g = layoutInflaterFrom;
        ViewOnClickListenerC5887b viewOnClickListenerC5887b = new ViewOnClickListenerC5887b(null);
        this.f28443j = viewOnClickListenerC5887b;
        this.f28447n = new DefaultTrackNameProvider(getResources());
        this.f28448o = TrackGroupArray.f9067f;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28441h = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(mtp.media.karaoke.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC5887b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(mtp.media.karaoke.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28442i = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(mtp.media.karaoke.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC5887b);
        addView(checkedTextView2);
    }
}
