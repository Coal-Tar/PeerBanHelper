package com.ghostchu.peerbanhelper.util.lab;

import com.ghostchu.peerbanhelper.text.Lang;
import com.ghostchu.peerbanhelper.text.TranslationComponent;

import java.util.List;

public enum Experiments {
    DNSJAVA(new Experiment("dnsjava", List.of(0, 1, 2, 3, 4), new TranslationComponent(Lang.LAB_EXPERIMENT_DNSJAVA_TITLE), new TranslationComponent(Lang.LAB_EXPERIMENT_DNSJAVA_DESCRIPTION))),
    SQLITE_VACUUM(new Experiment("sqlite_vacuum", List.of(0, 1, 2, 3, 4), new TranslationComponent(Lang.LAB_EXPERIMENT_SQLITE_VACUUM_TITLE), new TranslationComponent(Lang.LAB_EXPERIMENT_SQLITE_VACUUM_DESCRIPTION))),
    TRANSACTION_BATCH_BAN_HISTORY_WRITE(new Experiment("transaction_batch_ban_history_write", List.of(2, 5), new TranslationComponent(Lang.LAB_EXPERIMENT_TRANSACTION_BATCH_BAN_HISTORY_WRITE_TITLE), new TranslationComponent(Lang.LAB_EXPERIMENT_TRANSACTION_BATCH_BAN_HISTORY_WRITE_DESCRIPTION))),
    ;

    private final Experiment experiment;

    Experiments(Experiment experiment) {
        this.experiment = experiment;
    }

    public Experiment getExperiment() {
        return experiment;
    }
}
