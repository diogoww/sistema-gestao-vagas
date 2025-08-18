package br.com.diogow.gestao_vagas.modules.candidate.useCases;

import br.com.diogow.gestao_vagas.exceptions.JobNotFoundException;
import br.com.diogow.gestao_vagas.exceptions.UserNotFoundException;
import br.com.diogow.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.diogow.gestao_vagas.modules.company.repositories.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private JobRepository jobRepository;

    public void execute(UUID idCandidate, UUID idJob) {
        //validação candidato
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });
        //validação vaga
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });
        //inscrição candidato na vaga
    }
}
